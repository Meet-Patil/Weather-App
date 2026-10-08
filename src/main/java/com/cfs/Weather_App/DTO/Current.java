package com.cfs.Weather_App.DTO;

public class Current {
    public int last_updated_epoch;
    public String last_updated;
    public Double temp_c;
    public Double temp_f;
    public int is_day;
    public Condition condition;
    public Double wind_mph;
    public Double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public Double pressure_mb;
    public Double pressure_in;
    public Double precip_mm;
    public Double precip_in;
    public int humidity;
    public int cloud;
    public Double feelslike_c;
    public Double feelslike_f;
    public Double windchill_c;
    public Double windchill_f;
    public Double heatindex_c;
    public Double heatindex_f;
    public Double dewpoint_c;
    public Double dewpoint_f;
    public Double vis_km;
    public Double vis_miles;
    public Double uv;
    public Double gust_mph;
    public Double gust_kph;
    public int will_it_rain;
    public int chance_of_rain;
    public int will_it_snow;
    public int chance_of_snow;
    public Double wetbulb_c;
    public Double wetbulb_f;
    public Double short_rad;
    public Double diff_rad;
    public Double dni;
    public Double gti;

    public Current(int last_updated_epoch, String last_updated, Double temp_c, Double temp_f, int is_day, Condition condition, Double wind_mph, Double wind_kph, int wind_degree, String wind_dir, Double pressure_mb, Double pressure_in, Double precip_mm, Double precip_in, int humidity, int cloud, Double feelslike_c, Double feelslike_f, Double windchill_c, Double windchill_f, Double heatindex_c, Double heatindex_f, Double dewpoint_c, Double dewpoint_f, Double vis_km, Double vis_miles, Double uv, Double gust_mph, Double gust_kph, int will_it_rain, int chance_of_rain, int will_it_snow, int chance_of_snow, Double wetbulb_c, Double wetbulb_f, Double short_rad, Double diff_rad, Double dni, Double gti) {
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.is_day = is_day;
        this.condition = condition;
        this.wind_mph = wind_mph;
        this.wind_kph = wind_kph;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure_mb = pressure_mb;
        this.pressure_in = pressure_in;
        this.precip_mm = precip_mm;
        this.precip_in = precip_in;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.uv = uv;
        this.gust_mph = gust_mph;
        this.gust_kph = gust_kph;
        this.will_it_rain = will_it_rain;
        this.chance_of_rain = chance_of_rain;
        this.will_it_snow = will_it_snow;
        this.chance_of_snow = chance_of_snow;
        this.wetbulb_c = wetbulb_c;
        this.wetbulb_f = wetbulb_f;
        this.short_rad = short_rad;
        this.diff_rad = diff_rad;
        this.dni = dni;
        this.gti = gti;
    }

    public Current() {
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(int last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(Double temp_c) {
        this.temp_c = temp_c;
    }

    public Double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(Double temp_f) {
        this.temp_f = temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(Double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Double getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(Double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(Double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Double getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(Double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public Double getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(Double precip_in) {
        this.precip_in = precip_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public Double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(Double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Double getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(Double windchill_c) {
        this.windchill_c = windchill_c;
    }

    public Double getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(Double windchill_f) {
        this.windchill_f = windchill_f;
    }

    public Double getHeatindex_c() {
        return heatindex_c;
    }

    public void setHeatindex_c(Double heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public Double getHeatindex_f() {
        return heatindex_f;
    }

    public void setHeatindex_f(Double heatindex_f) {
        this.heatindex_f = heatindex_f;
    }

    public Double getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(Double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public Double getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(Double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public Double getVis_km() {
        return vis_km;
    }

    public void setVis_km(Double vis_km) {
        this.vis_km = vis_km;
    }

    public Double getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(Double vis_miles) {
        this.vis_miles = vis_miles;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getGust_mph() {
        return gust_mph;
    }

    public void setGust_mph(Double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public Double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(Double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public int getWill_it_rain() {
        return will_it_rain;
    }

    public void setWill_it_rain(int will_it_rain) {
        this.will_it_rain = will_it_rain;
    }

    public int getChance_of_rain() {
        return chance_of_rain;
    }

    public void setChance_of_rain(int chance_of_rain) {
        this.chance_of_rain = chance_of_rain;
    }

    public int getWill_it_snow() {
        return will_it_snow;
    }

    public void setWill_it_snow(int will_it_snow) {
        this.will_it_snow = will_it_snow;
    }

    public int getChance_of_snow() {
        return chance_of_snow;
    }

    public void setChance_of_snow(int chance_of_snow) {
        this.chance_of_snow = chance_of_snow;
    }

    public Double getWetbulb_c() {
        return wetbulb_c;
    }

    public void setWetbulb_c(Double wetbulb_c) {
        this.wetbulb_c = wetbulb_c;
    }

    public Double getWetbulb_f() {
        return wetbulb_f;
    }

    public void setWetbulb_f(Double wetbulb_f) {
        this.wetbulb_f = wetbulb_f;
    }

    public Double getShort_rad() {
        return short_rad;
    }

    public void setShort_rad(Double short_rad) {
        this.short_rad = short_rad;
    }

    public Double getDiff_rad() {
        return diff_rad;
    }

    public void setDiff_rad(Double diff_rad) {
        this.diff_rad = diff_rad;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Double getGti() {
        return gti;
    }

    public void setGti(Double gti) {
        this.gti = gti;
    }
}