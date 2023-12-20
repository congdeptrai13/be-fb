package com.example.mongoSpring.Service;

import com.example.mongoSpring.Model.Post;
import com.example.mongoSpring.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;

    public ArrayList<Post> submitPostToDB(Post postData){

        Date date=new Date();

        postData.setPostID(UUID.randomUUID());
        postData.setLikes(0);
        postData.setDateTime(date);

        postRepo.save(postData);
        ArrayList<Post> result=retrivePostFromDB();
        return result;
    }


    public ArrayList<Post> retrivePostFromDB(){
        ArrayList<Post> result=postRepo.findAll();
        return result;
    }

    public ArrayList<Post> deletePostFromDB(UUID postID){
        postRepo.deleteById(postID);

        ArrayList<Post> result=retrivePostFromDB();
        return result;
    }
}
