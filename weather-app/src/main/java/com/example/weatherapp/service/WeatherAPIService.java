package com.example.weatherapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.weatherapp.model.HourlyForecast;
import com.example.weatherapp.model.WeatherSummary;


@Service
public class WeatherAPIService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weather.api.baseurl}")
    private String baseUrl;

    @Cacheable("weatherSummaryCache")
    public WeatherSummary getWeatherSummary(String cityName) {
        // Make API 1 call
        String apiUrl = baseUrl + "/api1?city=" + cityName;
        ResponseEntity<WeatherSummary> response = restTemplate.getForEntity(apiUrl, WeatherSummary.class);
        return response.getBody();
    }

    @Cacheable("hourlyForecastCache")
    public HourlyForecast getHourlyForecast(String cityName) {
        // Make API 2 call
        String apiUrl = baseUrl + "/api2?city=" + cityName;
        ResponseEntity<HourlyForecast> response = restTemplate.getForEntity(apiUrl, HourlyForecast.class);
        return response.getBody();
    }
}

