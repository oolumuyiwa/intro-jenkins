package com.example.dao;

import org.springframework.stereotype.Component;
import com.example.model.Ride;
import com.example.model.User;

@Component
public interface RideDAO {
    void save(Ride ride);
	void update(Ride ride);
	void delete(Ride ride);
	Ride findByRideId(String rideId);
	void saveRider(Ride ride, User user);
	int countRides();
	void updateRideVacancy(Ride ride);
}
