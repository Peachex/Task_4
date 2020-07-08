package com.epam.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

/* 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
   и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
   методами. Задать критерии выбора данных и вывести эти данные на консоль.

   Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
   Найти и вывести:
   a) список рейсов для заданного пункта назначения;
   b) список рейсов для заданного дня недели;
   c) список рейсов для заданного дня недели, время вылета для которых больше заданного. */
public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();

        System.out.println("\nAll flights:");
        airport.viewAirlines();

        String destination = "Minsk";

        System.out.println("\nFlight(s) to " + destination + ":");
        airport.findFlightByDestination(destination);

        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;

        System.out.println("\nFlight(s) on " + dayOfWeek + ":");
        airport.findFlightByDayOfWeek(dayOfWeek);

        LocalTime time = LocalTime.of(11, 2, 29);

        System.out.println("\nFlight(s) on " + dayOfWeek + ", after " + time + " :");
        airport.findFlightByDayOfWeekAndTime(dayOfWeek, time);
    }
}
