package com.fundatec.AggregatorAPI.domain;

public class ClimateData {
    private Float temperature;
    private String wind_direction;
    private Float wind_velocity;
    private Float humidity;
    private String condition;
    private Float pressure;
    private String icon;
    private Float sensation;
    private String date;

    public ClimateData() {
        // empty for future use
    }

    public ClimateData(Float temperature, String wind_direction, Float wind_velocity, Float humidity, String condition, Float pressure, String icon, Float sensation, String date) {
        this.temperature = temperature;
        this.wind_direction = wind_direction;
        this.wind_velocity = wind_velocity;
        this.humidity = humidity;
        this.condition = condition;
        this.pressure = pressure;
        this.icon = icon;
        this.sensation = sensation;
        this.date = date;
    }

    public Float getTemperature() {
        return temperature;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public Float getWind_velocity() {
        return wind_velocity;
    }

    public Float getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public Float getPressure() {
        return pressure;
    }

    public String getIcon() {
        return icon;
    }

    public Float getSensation() {
        return sensation;
    }

    public String getDate() {
        return date;
    }
}
