package com.ps.weatherprediction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherMain {
    @JsonProperty("temp")
    private double temperature;
}
