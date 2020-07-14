package com.epam.task13;

public class State {
    private String stateName;
    private Region[] regions;
    private double stateArea;

    public State(String stateName, Region... regions) {
        this.stateName = stateName;
        this.regions = regions;
    }

    public void printCapitalCity() {
        for (Region region : this.regions) {
            for (District district : region.getDistricts()) {
                if (district.getCity().isCapitalCity()) {
                    System.out.println("Capital city: " + district.getCity().getCityName());
                    return;
                }
            }
        }
    }

    public void printNumberOfRegions() {
        System.out.println("\nNumber of regions: " + this.regions.length);
    }

    public void printStateArea() {
        System.out.println("\nState area: " + this.findStateArea());
    }

    public double findStateArea() {
        for (Region region : this.regions) {
            this.stateArea += region.getRegionArea();
        }

        return this.stateArea;
    }

    public void printRegionalCenter() {
        System.out.println("\nRegional center(s): ");

        for (Region region : this.regions) {
            for (District district : region.getDistricts()) {
                System.out.println(district.getCity().getCityName());
            }
        }
    }
}
