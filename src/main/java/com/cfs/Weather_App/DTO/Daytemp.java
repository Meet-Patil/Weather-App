package com.cfs.Weather_App.DTO;

import java.time.LocalDate;

public class Daytemp {

    private LocalDate date;

    private Double mintemp;

    private Double avgtemp;

    private Double maxtemp;

    public Daytemp() {
    }

    public Daytemp(LocalDate date, Double mintemp, Double avgtemp, Double maxtemp) {
        this.date = date;
        this.mintemp = mintemp;
        this.avgtemp = avgtemp;
        this.maxtemp = maxtemp;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getMintemp() {
        return mintemp;
    }

    public void setMintemp(Double mintemp) {
        this.mintemp = mintemp;
    }

    public Double getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(Double avgtemp) {
        this.avgtemp = avgtemp;
    }

    public Double getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Double maxtemp) {
        this.maxtemp = maxtemp;
    }
}
