package com.example.mongoSpring.Service;

import com.example.mongoSpring.Model.Comment;
import com.example.mongoSpring.Repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;

    public Comment saveComment(Comment comment) {
        Date date=new Date();

        comment.setCommentID(UUID.randomUUID());
        comment.setTimestamp(date);
        return commentRepo.save(comment);
    }

    public ArrayList<Comment> getAllComment(String postID){
        ArrayList<Comment> result=new ArrayList<Comment>();
        result=commentRepo.findAllByPostID(postID);
        return result;
    }
}
