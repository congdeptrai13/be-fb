package com.example.mongoSpring.Repository;

import com.example.mongoSpring.Model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface CommentRepo extends MongoRepository<Comment, UUID> {
    Comment save(Comment comment);

    ArrayList<Comment> findAllByPostID(UUID postID);
}
