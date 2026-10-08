package com.cfs.Weather_App.DTO;

public class WeatherResponce {
    private String city;
    private String reign;
    private String country;
    private String condition;
    private Double temperature;

    public WeatherResponce() {
    }

    public WeatherResponce(String city, String reign, String country, String condition, Double temperature) {
        this.city = city;
        this.reign = reign;
        this.country = country;
        this.condition = condition;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReign() {
        return reign;
    }

    public void setReign(String reign) {
        this.reign = reign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCondition() {
        return condition;
    }

     public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}