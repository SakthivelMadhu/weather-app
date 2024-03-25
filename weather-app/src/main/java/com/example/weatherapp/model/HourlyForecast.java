package com.example.weatherapp.model;

import java.util.List;

import lombok.Data;

@Data
public class HourlyForecast {
    private String city;
    private List<HourlyWeather> hourlyWeatherList;
    
}
