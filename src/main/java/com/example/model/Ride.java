package com.example.model;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
public class Ride {

    private String rideId;
	private String rideDate;
	private String rideTime;
	private String rideStartLocation;
	private String rideEndLocation;
	private int vacancy;

    public String getRideId() {
        return rideId;
    }

    @DynamoDbPartitionKey
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getRideDate() {
        return rideDate;
    }

    public void setRideDate(String rideDate) {
        this.rideDate = rideDate;
    }

    public String getRideTime() {
        return rideTime;
    }

    public void setRideTime(String rideTime) {
        this.rideTime = rideTime;
    }

    public String getRideStartLocation() {
        return rideStartLocation;
    }

    public void setRideStartLocation(String rideStartLocation) {
        this.rideStartLocation = rideStartLocation;
    }

    public String getRideEndLocation() {
        return rideEndLocation;
    }

    public void setRideEndLocation(String rideEndLocation) {
        this.rideEndLocation = rideEndLocation;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public Ride(){
    }
}
