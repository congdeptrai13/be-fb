package com.example.mongoSpring.Controller;

import com.example.mongoSpring.Model.Comment;
import com.example.mongoSpring.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{postID}")
    public ArrayList<Comment> getAllComments(@PathVariable("postID") String postID){
        return commentService.getAllComment(postID);
    }
}
