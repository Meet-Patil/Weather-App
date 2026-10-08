package com.cfs.Weather_App.DTO;

import java.util.List;

public class myForecast {
    private WeatherResponce weatherResponce;

    private List<Daytemp> days;

    public myForecast(WeatherResponce weatherResponce, List<Daytemp> days) {
        this.weatherResponce = weatherResponce;
        this.days = days;
    }

    public myForecast() {
    }

    public WeatherResponce getWeatherResponce() {
        return weatherResponce;
    }

    public void setWeatherResponce(WeatherResponce weatherResponce) {
        this.weatherResponce = weatherResponce;
    }

    public List<Daytemp> getDays() {
        return days;
    }

    public void setDays(List<Daytemp> days) {
        this.days = days;
    }
}
