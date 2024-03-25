document.addEventListener("DOMContentLoaded", function () {
    fetchWeatherData();
});

function fetchWeatherData() {
    fetch("http://localhost:8080/weather-summary?city=London", {
        headers: {
            "client-id": "your-client-id",
            "client-secret": "your-client-secret"
        }
    })
    .then(response => response.json())
    .then(data => {
        displayWeatherData(data);
    })
    .catch(error => {
        console.error("Error fetching weather data:", error);
    });
}

function displayWeatherData(data) {
    const weatherInfo = document.getElementById("weather-info");
    weatherInfo.innerHTML = `
        <h2>${data.city}</h2>
        <p>Summary: ${data.summary}</p>
        <p>Temperature: ${data.temperature}°C</p>
        <p>Humidity: ${data.humidity}%</p>
    `;
}



fetchWeatherData().then(data => {
    displayWeatherData(data);
}).catch(error => {
    console.error("Error fetching weather data:", error);
    // Display an error message to the user
});
