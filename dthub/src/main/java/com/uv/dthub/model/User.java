package com.uv.dthub.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String email;
    private String password; // hashed password
    private String role; // "developer" or "tester"
    private String name;
    private ContactDetails contactDetails;
    private String subscriptionLevel; // For developers: "Basic", "Standard", "Premium"
    private Integer coins; // For testers
    private List<String> skills; // For testers
    private List<String> preferences; // For testers, e.g., game genres
    private Boolean verified;
    private String createdAt;
    private String updatedAt;

    // Getters and Setters

    public static class ContactDetails {
        private String phone;
        private String address;

        // Getters and Setters
    }
}
