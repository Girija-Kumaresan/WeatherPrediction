package com.ps.weatherprediction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WeatherData {
    @JsonProperty
    private Date date;
    @JsonProperty
    private double temperature;
    @JsonProperty
    private double windSpeed;
    @JsonProperty
    private String description;
    @JsonProperty
    private String additionalAdvice;
}
