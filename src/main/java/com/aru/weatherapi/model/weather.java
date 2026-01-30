package com.aru.weatherapi.model;

public class weather {
    private double temperature;
    private String city;

    public weather() {
    }

    public weather(double temperature, String city) {
        this.temperature = temperature;
        this.city = city;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCity() {
        return city;
    }
}



