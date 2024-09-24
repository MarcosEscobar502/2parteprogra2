package com.example.demo.controllers;

import com.example.demo.models.Weather;
import com.example.demo.services.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {
    @InjectMocks
   private WeatherController Controller;

    @Mock
    private WeatherService service;

    @Test
    public void getWeather() {
        Weather weatherMdck=new Weather();
        weatherMdck.setMaxTemp(10);
        weatherMdck.setMinTemp(8);
        weatherMdck.setStatus("Cloudy");
        ;
    when(service.getWeather()).thenReturn(weatherMdck);
    controller.getWeather();

    verify(service, times(wantedNumber0finvocations:1)).getWeather();
    }
}
