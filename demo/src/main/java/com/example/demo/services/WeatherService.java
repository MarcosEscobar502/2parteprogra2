package com.example.demo.services;

import com.example.demo.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public Weather getWeather() {
        Weather weather = new Weather();
        weather.setMaxTemp(10);
        weather.setMinTemp(8);
        weather.setStatus("cloudy");

        return"weather";
    }

}

