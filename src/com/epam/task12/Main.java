package com.epam.task12;

/* 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
   менять колесо, вывести на консоль марку автомобиля. */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Reno", new Wheel(4), new Engine(1.8));
        car.viewCarName();
        car.viewCarInfo();

        car.drive();
        car.changeWheel();
        car.fillCar();

        car.setCarName("BMW");
        car.viewCarName();
    }
}
