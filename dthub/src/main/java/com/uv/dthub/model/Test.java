package com.uv.dthub.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "tests")
public class Test {

    private ObjectId id;
    private ObjectId gameId; // Reference to the Games collection
    private ObjectId testerId; // Reference to the User collection
    private String status; // e.g., "applied", "in-progress", "completed"
    private Report report;
    private int coinsReward;
    private Date appliedAt;
    private Date completedAt;

    // Inner class for the report structure
    public static class Report {
        private List<String> issuesFound;
        private List<String> bugs;
        private String feedback;

        // Getters and Setters
        public List<String> getIssuesFound() {
            return issuesFound;
        }

        public void setIssuesFound(List<String> issuesFound) {
            this.issuesFound = issuesFound;
        }

        public List<String> getBugs() {
            return bugs;
        }

        public void setBugs(List<String> bugs) {
            this.bugs = bugs;
        }

        public String getFeedback() {
            return feedback;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getGameId() {
        return gameId;
    }

    public void setGameId(ObjectId gameId) {
        this.gameId = gameId;
    }

    public ObjectId getTesterId() {
        return testerId;
    }

    public void setTesterId(ObjectId testerId) {
        this.testerId = testerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public int getCoinsReward() {
        return coinsReward;
    }

    public void setCoinsReward(int coinsReward) {
        this.coinsReward = coinsReward;
    }

    public Date getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(Date appliedAt) {
        this.appliedAt = appliedAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }
}

