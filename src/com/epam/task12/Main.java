package com.epam.task12;

/* 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
   менять колесо, вывести на консоль марку автомобиля. */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Reno", false,
                new Engine(1.8, false),
                new Wheel("Front right wheel"),
                new Wheel("Front left wheel"),
                new Wheel("Rear right wheel"),
                new Wheel("Rear left wheel"));

        car.viewCarName();
        car.viewCarInfo();

        car.fillTheCar();
        car.turnEngineOn();
        car.drive();

        car.changeWheel(1);

        car.setCarName("BMW");
        car.viewCarName();
        car.viewCarInfo();
    }
}
