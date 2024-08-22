package com.uv.dthub.model;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SupportTickets")
public class SupportTicket {

    @Id
    private ObjectId id;
    private String userId; // Reference to the User collection
    private String issueDescription;
    private String status; // e.g., "open", "in-progress", "resolved"
    private LocalDateTime submittedAt;
    private LocalDateTime resolvedAt;
    private String resolutionNotes;

    // Constructors
    public SupportTicket() {
    }

    public SupportTicket(String userId, String issueDescription, String status, LocalDateTime submittedAt, LocalDateTime resolvedAt, String resolutionNotes) {
        this.userId = userId;
        this.issueDescription = issueDescription;
        this.status = status;
        this.submittedAt = submittedAt;
        this.resolvedAt = resolvedAt;
        this.resolutionNotes = resolutionNotes;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(LocalDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public String getResolutionNotes() {
        return resolutionNotes;
    }

    public void setResolutionNotes(String resolutionNotes) {
        this.resolutionNotes = resolutionNotes;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                ", status='" + status + '\'' +
                ", submittedAt=" + submittedAt +
                ", resolvedAt=" + resolvedAt +
                ", resolutionNotes='" + resolutionNotes + '\'' +
                '}';
    }
}

