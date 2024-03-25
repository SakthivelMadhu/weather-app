package com.example.weatherapp.controller;

import com.example.weatherapp.model.ApiResponse;
import com.example.weatherapp.model.WeatherSummary;
import com.example.weatherapp.service.WeatherAPIService;
import com.example.weatherapp.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    
    private static final Logger logger = LoggerFactory.getLogger(WeatherAPIService.class);


    @GetMapping("/weather/summary")
    public ApiResponse getWeatherSummary(@RequestParam String city,
                                         @RequestHeader("client-id") String clientId,
                                         @RequestHeader("client-secret") String clientSecret) {
        return weatherService.getWeatherSummary(city, clientId, clientSecret);
    }

    @GetMapping("/weather/hourly")
    public ApiResponse getHourlyWeather(@RequestParam String city,
                                        @RequestHeader("client-id") String clientId,
                                        @RequestHeader("client-secret") String clientSecret) {
        return weatherService.getHourlyWeather(city, clientId, clientSecret);
    }
    
 // Controller method for weather summary endpoint
    @GetMapping("/weather-summary")
    public ResponseEntity<?> getWeatherSummary(@RequestParam String city) {
        try {
            // Call service method to fetch weather summary
            WeatherSummary weatherSummary = weatherService.getWeatherSummary(city);
            return ResponseEntity.ok(weatherSummary);
        } catch (Exception e) {
            // Log the error
            logger.error("Error fetching weather summary: {}", e.getMessage());
            // Return an error response to the client
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while fetching weather data");
        }
    }

}
