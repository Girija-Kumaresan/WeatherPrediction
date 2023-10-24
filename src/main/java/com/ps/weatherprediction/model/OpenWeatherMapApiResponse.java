package com.ps.weatherprediction.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
public class OpenWeatherMapApiResponse {
    @JsonProperty("list")
    @Getter
    @Setter
    private List<WeatherEntry> weatherEntries;
}