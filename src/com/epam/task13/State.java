package com.epam.task13;

public class State {
    private String stateName;
    private City capital;
    private Region[] regions;


    public State(String stateName, City capitalCity, Region... regions) {
        this.stateName = stateName;
        this.capital = capitalCity;
        this.regions = regions;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public City getCapital() {
        return this.capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Region[] getRegions() {
        return this.regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public void printCapitalCity() {
        System.out.println("Capital: " + this.capital);
    }

    public void printNumberOfRegions() {
        System.out.println("\nNumber of regions: " + this.regions.length);
    }

    public void printStateArea() {
        System.out.println("\nState area: " + this.findStateArea());
    }

    public double findStateArea() {
        double stateArea = 0;
        for (Region region : this.regions) {
            stateArea += region.getRegionArea();
        }
        return stateArea;
    }

    public void printRegionalCenter() {
        System.out.println("\nRegional center(s): ");
        for (Region region : this.regions) {
            region.printRegionalCenter();
        }
    }
}
