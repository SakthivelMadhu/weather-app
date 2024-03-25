package com.example.weatherapp.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class HourlyWeather {
    private LocalDateTime time;
    private String weather;
    private double temperature;
}
