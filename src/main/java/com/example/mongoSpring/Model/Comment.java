package com.example.mongoSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    private UUID commentID;

    private String postID;
    private String userID;

    private String userImage;
    private String userName;
    private String comment;
    private Date timestamp;
}
