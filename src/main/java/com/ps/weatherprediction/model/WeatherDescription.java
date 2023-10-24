package com.ps.weatherprediction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDescription {
    @JsonProperty("description")
    private String description;
}
