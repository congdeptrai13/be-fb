package com.example.mongoSpring.Service;

import com.example.mongoSpring.Model.User;
import com.example.mongoSpring.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    UserRepo userRepository;


    public User submitMetaDataOfUser(User user) {

        Date date=new Date();
        user.setActive(true);
        user.setJoiningDate(date);

        return userRepository.save(user);
    }

    public ArrayList<User> retrieveAllUserDetails(){
        return userRepository.findAll();
    }

    public User getUserData(String userID) {
        return userRepository.findAllByuserID(userID);
    }

    public User updateUserProfile(String id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setUserName(updatedUser.getUserName());
            existingUser.setUserImage(updatedUser.getUserImage());
            userRepository.save(existingUser);
            return userRepository.findAllByuserID(id);
        } else {
            return null;
        }
    }
}