package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather() {
        // Replace 'London' with any city you want
        String url = "http://api.weatherstack.com/current?access_key=0894ae5155d2e9c7046011733b6fa2c9&query=Nagercoil";

        // Initialize RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Fetch weather data from the Weather API
        String response = restTemplate.getForObject(url, String.class);

        // Return the weather response as a String
        return response;
    }
}
