package com.example.mongoSpring.Repository;

import com.example.mongoSpring.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface UserRepo extends MongoRepository<User, String> {

    User save(User user);
    ArrayList<User> findAll();
    User findAllByuserID(String userID);
}
