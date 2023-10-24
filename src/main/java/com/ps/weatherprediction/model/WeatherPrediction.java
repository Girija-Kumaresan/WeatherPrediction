package com.ps.weatherprediction.model;
import java.util.List;

public class WeatherPrediction {
    public static void applyWeatherConditions(List<WeatherData> forecastData) {
        for (WeatherData data : forecastData) {
            checkHighTemperature(data);
            checkRain(data);
            checkHighWinds(data);
            checkThunderstorms(data);
        }
    }
    private static void checkHighTemperature(WeatherData data) {
        if (data.getTemperature() > 40.0) {
            data.setAdditionalAdvice("Use sunscreen lotion");
        }
    }
    private static void checkRain(WeatherData data) {
        if (data.getDescription().toLowerCase().contains("rain")) {
            data.setAdditionalAdvice("Carry an umbrella");
        }
    }

    private static void checkHighWinds(WeatherData data) {
        if (data.getWindSpeed() > 10.0) {
            data.setAdditionalAdvice("It’s too windy, watch out!");
        }
    }
    private static void checkThunderstorms(WeatherData data) {
        if (data.getDescription().toLowerCase().contains("thunderstorm")) {
            data.setAdditionalAdvice("Don’t step out! A Storm is brewing!");
        }
    }
}
