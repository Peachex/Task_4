package com.epam.task13;

public class Region {
    private String regionName;
    private City regionalCenter;
    private District[] districts;
    private double regionArea;

    public Region(String regionName, City regionalCenter, double regionArea, District... districts) {
        this.regionName = regionName;
        this.regionalCenter = regionalCenter;
        this.regionArea = regionArea;
        this.districts = districts;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionalCenter() {
        return this.regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public District[] getDistricts() {
        return this.districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public double getRegionArea() {
        return this.regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }

    public void printRegionalCenter() {
        System.out.println(this.regionalCenter);
    }
}
