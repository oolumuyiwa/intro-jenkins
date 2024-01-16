package com.example.dao;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface SearchDAO {
    public List search_Ride(String rdate);
    public List show_Ride(String userId);
}
