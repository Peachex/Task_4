package com.epam.task12;

public class Car {
    private String carName;
    private Wheel wheels;
    private Engine engine;

    public Car(String carName, Wheel wheels, Engine engine) {
        this.carName = carName;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        System.out.println("The car is moving!");
    }

    public void fillCar() {
        System.out.println("Full tank!");
    }

    public void changeWheel() {
        System.out.println("The wheel was changed!");
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void viewCarName() {
        System.out.println("\nCar name: " + this.carName);
    }

    public void viewCarInfo() {
        System.out.println(this.engine);
        System.out.println(this.wheels);
    }
}
