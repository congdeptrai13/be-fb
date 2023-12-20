package com.example.mongoSpring.Controller;

import com.example.mongoSpring.Model.Status;
import com.example.mongoSpring.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/statusService")
public class StatusController {
    @Autowired
    StatusService statusService;

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status) {
        return statusService.saveStatus(status);
    }


    @GetMapping("/getAllStatus")
    public ArrayList<Status> getAllStatus() {
        return statusService.getAllStatus();
    }
}
