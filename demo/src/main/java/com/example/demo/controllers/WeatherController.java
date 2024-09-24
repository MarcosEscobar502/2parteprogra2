package com.example.demo.controllers;

import com.example.demo.models.Weather;
import com.example.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
@Autowired

    private WeatherService Service;

    @GetMapping("/api/weather")
   public String getWeather() {

       return service.getWeather();

   }

}
