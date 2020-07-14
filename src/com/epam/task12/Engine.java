package com.epam.task12;

public class Engine {
    private double engineVolume;
    private boolean engineIsOn;

    public Engine(double engineVolume, boolean engineIsOn) {
        this.engineVolume = engineVolume;
        this.engineIsOn = engineIsOn;
    }

    public boolean isOn() {
        return this.engineIsOn;
    }

    public void setEngineIsOn(boolean engineIsOn) {
        this.engineIsOn = engineIsOn;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }
}
