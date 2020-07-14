package com.epam.task12;

public class Wheel {
    private static int count = 1;
    private String wheelName;
    private int wheelId;

    public Wheel(String wheelName) {
        this.wheelName = wheelName;
        this.wheelId = count++;
    }

    public String getWheelName() {
        return this.wheelName;
    }

    public int getWheelId() {
        return this.wheelId;
    }
}
