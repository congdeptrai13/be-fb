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
public class Post {
    @Id
    private UUID postID;
    private String userID;
    private String userName;
    private String imageURL;

    private String description;
    private String postImgURL;

    private int likes;
    private Date dateTime;

}
