package com.epam.task13;

public class District {
    private String districtName;
    private City[] cities;

    public District(String districtName, City... cities) {
        this.districtName = districtName;
        this.cities = cities;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City[] getCities() {
        return this.cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
