package com.example.weatherapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weatherapp.model.User;
import com.example.weatherapp.repository.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    // Method to authenticate the client based on provided client ID and client secret
    public boolean authenticate(String clientId, String clientSecret) {
        // Fetch user from the database based on client ID
        User user = userRepository.findByClientId(clientId);
        if (user != null) {
            // Compare the retrieved client secret with the provided client secret
            return user.getClientSecret().equals(clientSecret);
        }
        return false;
    }
}

