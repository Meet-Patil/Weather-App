package com.cfs.Weather_App.Service;

import com.cfs.Weather_App.DTO.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.forecast.url}")
    private String apiForecastUrl;

    private RestTemplate template = new RestTemplate();

    public String test() {
        return "it is an success";
    }

    public WeatherResponce getData(String city) {
        String url = apiUrl + "?key=" + apiKey + "&q=" + city;
        Root responce = template.getForObject(url, Root.class);
        WeatherResponce weatherResponce = new WeatherResponce();

        weatherResponce.setCity(responce.getLocation().name);
        weatherResponce.setReign(responce.getLocation().region);
        weatherResponce.setCountry(responce.getLocation().country);
        weatherResponce.setCondition(responce.getCurrent().condition.text);
        weatherResponce.setTemperature(responce.getCurrent().temp_c);

        return weatherResponce;

    }

    public myForecast getforecastData(String city, int days) {
        myForecast forecast = new myForecast();
        WeatherResponce data = getData(city);
        forecast.setWeatherResponce(getData(city));

        List<Daytemp> daylist = new ArrayList<>();
        String url = apiForecastUrl
                + "?key=" + apiKey
                + "&q=" + city
                + "&days=" + days;
        Root apiresponce = template.getForObject(url, Root.class);
        Forecast forecast1 = apiresponce.getForecast();
        ArrayList<Forecastday> forecastday = forecast1.getForecastday();
        for (Forecastday day : forecastday) {
            Daytemp d = new Daytemp();
            d.setDate(day.getDate());
            d.setMintemp(day.getDay().mintemp_c);
            d.setAvgtemp(day.getDay().avgtemp_c);
            d.setMaxtemp(day.getDay().maxtemp_c);
            daylist.add(d);
        }
        forecast.setDays(daylist);
        return forecast;
    }

}
