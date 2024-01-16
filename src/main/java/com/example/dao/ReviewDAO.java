package com.example.dao;

import org.springframework.stereotype.Component;
import com.example.model.Review;

@Component
public interface ReviewDAO {
    
    void save(Review review);
    void update(Review review);
	void delete(Review review);
	Review findByReviewId(String reviewId);
	Review findByExistingUserAndRide(String userId,String rideId);

}
