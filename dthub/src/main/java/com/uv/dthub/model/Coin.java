package com.uv.dthub.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "coins")
public class Coin {

    @Id
    private ObjectId id;

    @Field("userId")
    private String userId;  // Reference to the User collection

    @Field("transactionType")
    private String transactionType;  // e.g., "purchase", "redemption"

    @Field("amount")
    private int amount;

    @Field("coinsBefore")
    private int coinsBefore;

    @Field("coinsAfter")
    private int coinsAfter;

    @Field("transactionDate")
    private Date transactionDate;

    @Field("details")
    private String details;  // e.g., description of the transaction

    // Constructors, Getters, and Setters

    public Coin() {
    }

    public Coin(String userId, String transactionType, int amount, int coinsBefore, int coinsAfter, Date transactionDate, String details) {
        this.userId = userId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.coinsBefore = coinsBefore;
        this.coinsAfter = coinsAfter;
        this.transactionDate = transactionDate;
        this.details = details;
    }

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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCoinsBefore() {
        return coinsBefore;
    }

    public void setCoinsBefore(int coinsBefore) {
        this.coinsBefore = coinsBefore;
    }

    public int getCoinsAfter() {
        return coinsAfter;
    }

    public void setCoinsAfter(int coinsAfter) {
        this.coinsAfter = coinsAfter;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

