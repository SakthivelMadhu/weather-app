package com.example.weatherapp.model;

import lombok.Data;

@Data
public class WeatherSummary {
    
	private String city;
    private String summary;
    private int Temperature;
    private int Humidity;
    
  
    
    public WeatherSummary(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}
}
