package com.example.factory;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.DynamoDbClientBuilder;
import com.example.model.Review;
import com.example.model.Ride;
import com.example.model.User;
import com.example.model.ViewRide;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.regions.Region;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Regions;

@Configuration
public class DynamoDBClientFactory {
    private final DynamoDbClientBuilder builder =
            DynamoDbClient.builder()
                .region(Region.US_EAST_2);
    private TableSchema<Review> reviewSchema = TableSchema.fromBean(Review.class);
    private TableSchema<Ride> rideSchema = TableSchema.fromBean(Ride.class);
    private TableSchema<User> userSchema = TableSchema.fromBean(User.class);
    private TableSchema<ViewRide> viewRideSchema = TableSchema.fromBean(ViewRide.class);

    @Bean
    public DynamoDbClient createClient() {
        return builder.credentialsProvider(createCredentialsProvider())
                      .build();
    }

    public AwsCredentialsProvider createCredentialsProvider(){
        return DefaultCredentialsProvider.builder().build();
    }

    @Bean
    public DynamoDbEnhancedClient createEnhancedClient(){
        return DynamoDbEnhancedClient.builder()
                                     .dynamoDbClient(createClient())
                                     .build();
    }
}