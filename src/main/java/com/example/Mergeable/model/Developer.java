package com.example.Mergeable.model;

import java.time.LocalDateTime;

public class Developer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String linkedInUrl;
    private String gitHubUrl;
    private LocalDateTime createdAt;

    public Developer(String id, String firstName, String lastName, String email, String phoneNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
}
