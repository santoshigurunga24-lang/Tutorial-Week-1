package com.ingcollegeapt.week1tut.model;

//Create a POJO Class for Topic

import java.time.LocalDateTime;


/*
It has id, name, created and updated TimeStamp
*/
public class Topic {
    private int topicID;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Topic(){
    }

    public Topic(int topicID, String name) {
        this.topicID = topicID;
        this.name = name;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
        this.updatedAt = LocalDateTime.now();//update te timestamp whenever the topic id is change
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}