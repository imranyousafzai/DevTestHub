package com.uv.dthub.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "games")
public class Game {

    @Id
    private ObjectId id;
    private String title;
    private String description;
    private String googlePlayLink;
    private List<String> typeOfTesting; // e.g., "functionality", "usability", "performance"
    private String targetAudience;
    private ObjectId developerId; // Reference to the User collection
    private String status; // e.g., "pending", "in-progress", "completed"
    private Date createdAt;
    private Date updatedAt;

    // Constructors
    public Game() {}

    public Game(ObjectId id, String title, String description, String googlePlayLink, List<String> typeOfTesting, String targetAudience, ObjectId developerId, String status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.googlePlayLink = googlePlayLink;
        this.typeOfTesting = typeOfTesting;
        this.targetAudience = targetAudience;
        this.developerId = developerId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGooglePlayLink() {
        return googlePlayLink;
    }

    public void setGooglePlayLink(String googlePlayLink) {
        this.googlePlayLink = googlePlayLink;
    }

    public List<String> getTypeOfTesting() {
        return typeOfTesting;
    }

    public void setTypeOfTesting(List<String> typeOfTesting) {
        this.typeOfTesting = typeOfTesting;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public ObjectId getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(ObjectId developerId) {
        this.developerId = developerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

