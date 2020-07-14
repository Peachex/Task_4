package com.epam.task13;

public class District {
    private String districtName;
    private City city;

    public District(String districtName, City city) {
        this.districtName = districtName;
        this.city = city;
    }

    public City getCity() {
        return this.city;
    }
}
