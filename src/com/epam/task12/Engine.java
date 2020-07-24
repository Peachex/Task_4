package com.epam.task12;

public class Engine {
    private double engineVolume;
    private boolean isEngineOn;

    public Engine(double engineVolume, boolean engineIsOn) {
        this.engineVolume = engineVolume;
        this.isEngineOn = engineIsOn;
    }

    public boolean isOn() {
        return this.isEngineOn;
    }

    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Engine volume: " + this.engineVolume + "\nEngine is " + (this.isOn()? "ON" : "OFF");
    }
}
