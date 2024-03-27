# weather-app

# Weather API Integration Project

## Overview

This project demonstrates the integration of Weather APIs into a Spring Boot application. It allows users to fetch weather forecasts and summaries for different cities using RESTful APIs. The project includes backend services for API integration, authentication, and frontend development for displaying weather data.


## Frontend HomePage

![Screenshot 2024-03-27 100850](https://github.com/SakthivelMadhu/weather-app/assets/62326876/a76f77c0-08ea-4c2b-aadf-b8d283e76b4d)





## Deployment links

Backend Deployment : 
```bash
weather-app-production-26ae.up.railway.app
```
Frontend Deployment : 
```bash
https://6603a22ea4541d4a140ca611--jade-mermaid-2c4abf.netlify.app/
```

## Functionality

- Integration with Weather APIs to fetch weather forecasts and summaries.
- Header-based authentication using randomly generated client ID and client secret.
- Frontend development using HTML, CSS, and JavaScript to display weather data.
- Error handling for API request failures and invalid authentication credentials.
- Caching mechanisms to improve performance and reduce API calls.

## Technologies Used

- Java
- Spring Boot
- RESTful APIs
- HTML
- CSS
- JavaScript

## Setup Instructions

1. Clone the repository:

```bash
   git clone https://github.com/SakthivelMadhu/weather-app
```

1. Navigate to the project directory:
```bash
cd weather-api-integration
```

2. Run the Spring Boot application:
```bash
mvn spring-boot:run
```

3. Access the application in a web browser at http://127.0.0.1:5500/


# Project  Structure Explanation:

```bash

weather-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── weatherapp/
│   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   ├── WeatherController.java      # Controller class to handle HTTP requests
│   │   │   │   │   │   ├── model/
│   │   │   │   │   │   │   ├── WeatherSummary.java         # Java object for weather summary
│   │   │   │   │   │   │   ├── HourlyForecast.java         # Java object for hourly forecast
│   │   │   │   │   │   │   ├── HourlyWeather.java          # Java object for hourly weather details
│   │   │   │   │   │   │   ├── User.java                   # Java object for User details
│   │   │   │   │   │   │   ├── ApiResponse.java            # Java object for api response details
│   │   │   │   │   │   │   ├── Weather.java                # Java object for  weather details
│   │   │   │   │   │   ├── service/
│   │   │   │   │   │   │   ├── WeatherAPIService.java      # Service class to integrate Weather API
│   │   │   │   │   │   │   ├── WeatherService.java         # Service class to integrate Weather 
│   │   │   │   │   │   │   ├── AuthenticationService.java  # Service class for header-based authentication
│   │   │   │   │   │   ├── config/
│   │   │   │   │   │   │   ├── WebConfig.java              # Configuration class for filters/interceptors
│   │   │   │   │   │   │   ├── RapidAPIConfig.java         # Configuration class for RapidAPI integration
│   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   │   ├── USerRepository.java         #  interface to fetch a user by their client ID.
│   │   │   │   │   │   ├── filter/
│   │   │   │   │   │   │   ├── AuthenticationFilter.java   # Filter for header-based authentication
│   │   │   │   │   │   ├── WeatherAppApplication.java      # Main class to run Spring Boot application
│   ├── resources/
│   │   ├── application.properties                          # Application properties file
│   │   └── templates/
│   │   └── static/
│   │       ├── index.html                                  # Frontend HTML file
│   │       ├── styles.css                                  # Frontend CSS file
│   │       ├── scripts.js                                  # Frontend JavaScript file
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── weatherapp/
│   │   │   │   │   │   ├── WeatherAppApplicationTests.java # Main class to run Spring Boot test application
│   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   ├── WeatherControllerTest.java  # contains unit tests for the WeatherController class.
│   │   │   │   │   │   ├── service/
│   │   │   │   │   │   │   ├── WeatherAPIServiceTest.java  #  contains unit tests for the WeatherAPIService class
├── pom.xml                                                 # Maven project configuration file
├── README.md                                               # Project documentation

```




# Usage of API Keys
To use the Weather APIs integrated into the project, you need to obtain API keys from the respective providers. Once obtained, configure the API keys in the application.properties file.

# Error Handling
The application includes error handling mechanisms to deal with API request failures and invalid authentication credentials. Error responses are returned with appropriate HTTP status codes and error messages.

# Caching Mechanisms
Caching mechanisms are implemented in the project to improve performance and reduce the number of API calls. The caching configuration can be found in the application.properties file.

# Frontend Development
The frontend development is implemented using HTML, CSS, and JavaScript. You can extend the frontend to include more interactive features or customization options by modifying the HTML, CSS, and JavaScript files located in the resources/static directory.

# Testing
The project includes unit tests and integration tests to ensure the reliability of the codebase. You can run the tests using Maven or your preferred IDE.
```
