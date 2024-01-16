package com.example.model;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndex;

@DynamoDbBean
public class Review {
    
    
    private String reviewId;
    private int stars;
    private User user;
    private Ride ride;

    

    public String getReviewId() {
        return reviewId;
    }

    @DynamoDbPartitionKey
    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public User getUser() {
        return user;
    }
    @DynamoDbSortKey
    public void setUser(User user) {
        this.user = user;
    }
    public Ride getRide() {
        return ride;
    }
    public void setRide(Ride ride) {
        this.ride = ride;
    }
}
