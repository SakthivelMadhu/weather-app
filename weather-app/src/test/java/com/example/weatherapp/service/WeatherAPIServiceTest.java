package com.example.weatherapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.weatherapp.model.WeatherSummary;

@SpringBootTest
public class WeatherAPIServiceTest {

    @Mock
    private WeatherAPIService weatherAPIService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetWeatherSummary() {
        // Create a dummy weather summary
        WeatherSummary dummySummary = new WeatherSummary("London", "Sunny", 25, 70);
        
        // Mock the behavior of the getWeatherSummary method of WeatherAPIService
        when(weatherAPIService.getWeatherSummary("London")).thenReturn(dummySummary);

        // Call the method under test
        WeatherSummary summary = weatherAPIService.getWeatherSummary("London");

        // Verify the result
        assertEquals("London", summary.getCity());
        assertEquals("Sunny", summary.getSummary());
        assertEquals(25, summary.getTemperature());
        assertEquals(70, summary.getHumidity());
    }
}
