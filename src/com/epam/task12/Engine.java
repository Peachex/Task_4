package com.epam.task12;

public class Engine {
    private double engineVolume;

    public Engine(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Engine volume: " + this.engineVolume;
    }
}
