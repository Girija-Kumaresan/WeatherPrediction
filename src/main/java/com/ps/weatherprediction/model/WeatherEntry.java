package com.ps.weatherprediction.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class WeatherEntry {
        @JsonProperty("dt")
        private long timestamp;
        @JsonProperty("main")
        private WeatherMain main;
        @JsonProperty("weather")
        private List<WeatherDescription> weatherDescriptions;
        @JsonProperty("wind")
        private Wind wind;
}
