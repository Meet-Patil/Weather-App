package com.cfs.Weather_App.controller;

import com.cfs.Weather_App.DTO.myForecast;
import com.cfs.Weather_App.DTO.WeatherResponce;
import com.cfs.Weather_App.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Controller {
    @Autowired
    private WeatherService service;

    @GetMapping("/my/{city}")
    public WeatherResponce getCity(@PathVariable String city) {
        return service.getData(city);

    }

    @GetMapping("/my")
    public myForecast getForecastCity(@RequestParam String city, @RequestParam int days) {
        return service.getforecastData(city, days);
    }


}
