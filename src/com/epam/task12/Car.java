package com.epam.task12;

public class Car {
    private String carName;
    private boolean tankIsFull;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String carName, boolean tankIsFull, Engine engine, Wheel... wheels) {
        this.carName = carName;
        this.tankIsFull = tankIsFull;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        if (engine.isOn() && this.tankIsFull) {
            System.out.println("The car is moving!");
        } else {
            if (!engine.isOn()) {
                System.out.println("Please, turn on engine!");
            } else {
                if (!this.tankIsFull) {
                    System.out.println("Please, fill the car!");
                }
            }
        }
    }

    public void turnEngineOn() {
        if (this.tankIsFull) {
            this.engine.setEngineIsOn(true);
            System.out.println("Engine is on!");
        } else {
            System.out.println("Engine is off, please fill the car!");
        }
    }

    public void fillTheCar() {
        if (!tankIsFull) {
            tankIsFull = true;
            System.out.println("The tank was empty but now it is full!");
        } else {
            System.out.println("You don't need to fill the car!");
        }
    }

    public void changeWheel(int wheelId) {
        this.wheels[wheelId - 1] = new Wheel("Changed wheel");
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void viewCarName() {
        System.out.println("\nCar name: " + this.carName);
    }

    public void viewCarInfo() {
        System.out.println("Engine volume: " + this.engine.getEngineVolume());

        for (Wheel wheel : this.wheels) {
            System.out.println(wheel.getWheelName());
            System.out.println("Wheel id: " + wheel.getWheelId());
        }

        if (this.tankIsFull) {
            System.out.println("Tank: full!\n");
        } else {
            System.out.println("Tank: empty!\n");
        }
    }
}