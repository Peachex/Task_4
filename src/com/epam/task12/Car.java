package com.epam.task12;

public class Car {
    private String carName;
    private boolean isTankFull;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String carName, boolean tankIsFull, Engine engine, Wheel... wheels) {
        this.carName = carName;
        this.isTankFull = tankIsFull;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        if (engine.isOn() && this.isTankFull) {
            System.out.println("The car is moving!");
        } else {
            if (!engine.isOn()) {
                System.out.println("Please, turn on engine!");
            }
            if (!this.isTankFull) {
                System.out.println("Please, fill the car!");
            }
        }
    }

    public void turnEngineOn() {
        if (this.isTankFull) {
            this.engine.setEngineOn(true);
            System.out.println("Engine is on!");
        } else {
            System.out.println("Engine is off, please fill the car!");
        }
    }

    public void fillTheCar() {
        if (!isTankFull) {
            isTankFull = true;
            System.out.println("The tank was empty but now it is full!");
        } else {
            System.out.println("You don't have to fill the car!");
        }
    }

    public Wheel changeWheel(int wheelNumber, String wheelName) {
        wheelNumber--;
        Wheel oldWheel = this.wheels[wheelNumber];
        this.wheels[wheelNumber] = new Wheel(wheelName);
        return oldWheel;
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isTankFull() {
        return isTankFull;
    }

    public void setTankFull(boolean tankFull) {
        this.isTankFull = tankFull;
    }

    public void viewCarInfo() {
        System.out.println(this.engine);
        for (Wheel wheel : this.wheels) {
            System.out.println(wheel);
        }
        System.out.println("Tank: " + (this.isTankFull ? "full!" : "empty!"));
    }

    public void viewCarName() {
        System.out.println("\nCar name: " + this.carName);
    }
}