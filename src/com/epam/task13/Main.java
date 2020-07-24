package com.epam.task13;

/* 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */
public class Main {
    public static void main(String[] args) {
        City minsk = new City("Minsk");
        State state = new State("Belarus", minsk,
                new Region("Brest", new City("Brest"), 32.8, new District("Brest",
                        new City("Brest"), new City("Pinsk"), new City("Baranovichi"))),

                new Region("Vitebsk", new City("Vitebsk"), 40.1, new District("Vitebsk",
                        new City("Vitebsk"), new City("Novopolotsk"), new City("Orsha"))),

                new Region("Gomel", new City("Gomel"), 40.4, new District("Gomel",
                        new City("Gomel"), new City("Zhlobin"))),

                new Region("Grodno", new City("Grodno"), 25.1, new District("Grodno",
                        new City("Grodno"), new City("Lida"), new City("Slonim"))),

                new Region("Minsk", minsk, 39.8, new District("Minsk",
                        minsk, new City("Borisov"), new City("Molodechno"))),

                new Region("Mogilev", new City("Mogilev"), 29.1, new District("Mogilev",
                        new City("Mogilev"), new City("Bobruisk"))));

        state.printCapitalCity();
        state.printNumberOfRegions();
        state.printRegionalCenter();
        state.printStateArea();
    }
}
