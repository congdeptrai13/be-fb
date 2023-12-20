package com.example.mongoSpring.Service;

import com.example.mongoSpring.Model.Status;
import com.example.mongoSpring.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;

    public Status saveStatus(Status status) {

        Date date=new Date();

        status.setStatusID(UUID.randomUUID());
        status.setUploadTIme(date);
        return statusRepo.save(status);
    }

    public ArrayList<Status> getAllStatus(){
        ArrayList<Status> result=new ArrayList<Status>();
        result=statusRepo.findAll();
        result.sort((e1, e2) -> e2.getUploadTIme().compareTo(e1.getUploadTIme()));
        return result;
    }
}
