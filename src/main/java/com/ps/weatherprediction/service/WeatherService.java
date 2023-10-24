package com.ps.weatherprediction.service;

import com.ps.weatherprediction.model.WeatherData;
import com.ps.weatherprediction.model.WeatherPrediction;
import java.util.List;

public class WeatherService {

    public static void processWeatherData(List<WeatherData> forecastData) {
        WeatherPrediction.applyWeatherConditions(forecastData);
    }
}
