package com.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.example.dao.ReviewDAO;
import com.example.model.Review;

import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Service
@Transactional
public class ReviewDAOImpl implements ReviewDAO{
    
    @Autowired
    public DynamoDbEnhancedClient enhancedClient;

    @Override
    public void save(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Review review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Review findByReviewId(String reviewId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByReviewId'");
    }

    @Override
    public Review findByExistingUserAndRide(String userId, String rideId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByExistingUserAndRide'");
    }
    
}
