package com.epam.task13;

public class Region {
    private String regionName;
    private District[] districts;
    private double regionArea;

    public Region(String regionName, double regionArea, District... districts) {
        this.regionName = regionName;
        this.regionArea = regionArea;
        this.districts = districts;
    }

    public District[] getDistricts() {
        return this.districts;
    }

    public double getRegionArea() {
        return this.regionArea;
    }
}
