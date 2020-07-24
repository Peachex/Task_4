package com.epam.task13;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String toString() {
        return this.cityName;
    }
}
