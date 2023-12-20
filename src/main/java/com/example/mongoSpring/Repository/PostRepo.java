package com.example.mongoSpring.Repository;

import com.example.mongoSpring.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface PostRepo extends MongoRepository<Post,UUID> {
    ArrayList<Post> findAll();
    Post save(Post post);
    void deleteById(UUID postID);
}
