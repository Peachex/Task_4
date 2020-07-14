package com.epam.task13;

/* 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */
public class Main {
    public static void main(String[] args) {
        State state = new State("Belarus",
                new Region("Brest", 32.8, new District("Brest", new City("Brest"))),
                new Region("Vitebsk", 40.1, new District("Vitebsk", new City("Vitebsk"))),
                new Region("Gomel", 40.4, new District("Gomel", new City("Gomel"))),
                new Region("Grodno", 25.1, new District("Grodno", new City("Grodno"))),
                new Region("Minsk", 39.8, new District("Minsk", new City("Minsk", true))),
                new Region("Mogilev", 29.1, new District("Mogilev", new City("Mogilev"))));

        state.printCapitalCity();
        state.printNumberOfRegions();
        state.printRegionalCenter();
        state.printStateArea();
    }
}
