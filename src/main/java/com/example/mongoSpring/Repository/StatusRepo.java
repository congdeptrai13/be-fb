package com.example.mongoSpring.Repository;

import com.example.mongoSpring.Model.Post;
import com.example.mongoSpring.Model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface StatusRepo extends MongoRepository<Status, UUID> {
    Status save(Status status);
    ArrayList<Status> findAll();
}
