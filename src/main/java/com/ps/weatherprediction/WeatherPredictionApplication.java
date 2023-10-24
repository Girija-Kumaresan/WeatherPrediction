package com.ps.weatherprediction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ps.weatherprediction")
public class WeatherPredictionApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherPredictionApplication.class, args);
	}
}
