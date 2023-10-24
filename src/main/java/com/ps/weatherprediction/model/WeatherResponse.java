package com.ps.weatherprediction.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class WeatherResponse {
    @JsonProperty("city")
    private String city;
    @JsonProperty("forecasts")
    private List<WeatherData> forecasts;
}
