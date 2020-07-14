package com.epam.task13;

public class City {
    private String cityName;
    private boolean capitalCity;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, boolean isCapitalCity) {
        this.cityName = cityName;
        this.capitalCity = isCapitalCity;
    }

    public String getCityName() {
        return this.cityName;
    }

    public boolean isCapitalCity() {
        return this.capitalCity;
    }
}
