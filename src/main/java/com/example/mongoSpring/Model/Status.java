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
public class Status {
    @Id
    private UUID statusID;

    private String userID;
    private String statusImageURL;
    private Date uploadTIme;
}
