package com.ps.weatherprediction.controller;
import com.ps.weatherprediction.model.OpenWeatherMapApiResponse;
import com.ps.weatherprediction.model.WeatherData;
import com.ps.weatherprediction.model.WeatherEntry;
import com.ps.weatherprediction.model.WeatherResponse;
import com.ps.weatherprediction.service.WeatherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WeatherController {
    private final String OPENWEATHERMAP_API_KEY = "d2929e9483efc82c82c32ee7e02d563e";
    private final String OPENWEATHERMAP_API_URL = "https://api.openweathermap.org/data/2.5/forecast";
    @CrossOrigin
    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam String city) {
        List<WeatherData> forecastData = fetchWeatherData(city);
        WeatherService.processWeatherData(forecastData);
        WeatherResponse response = new WeatherResponse();
        response.setCity(city);
        response.setForecasts(forecastData);
        return response;
    }

    private List<WeatherData> fetchWeatherData(String city) {
        String apiUrl = OPENWEATHERMAP_API_URL + "?q=" + city + "&appid=" + OPENWEATHERMAP_API_KEY + "&cnt=10";
        RestTemplate restTemplate = new RestTemplate();
        OpenWeatherMapApiResponse apiResponse = restTemplate.getForObject(apiUrl, OpenWeatherMapApiResponse.class);
        List<WeatherData> forecastData = new ArrayList<>();
        for (WeatherEntry entry : apiResponse.getWeatherEntries()) {
            WeatherData data = new WeatherData();
            data.setDate(new Date(entry.getTimestamp() * 1000));
            data.setTemperature(entry.getMain().getTemperature() - 273.15);
            data.setWindSpeed(entry.getWind().getSpeed());
            data.setDescription(entry.getWeatherDescriptions().get(0).getDescription());
            data.setAdditionalAdvice("");
            forecastData.add(data);
        }
        return forecastData;
    }
}
