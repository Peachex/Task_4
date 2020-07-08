package com.epam.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airport {
    private Airline[] airlinesArray;

    public Airport() {
        airlinesArray = new Airline[]{
                new Airline("Minsk", 4, "Jumbo Passenger Jet",
                        LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY),

                new Airline("Beijing", 2, "Mid Size Passenger Jet",
                        LocalTime.of(5, 25, 1), DayOfWeek.FRIDAY),

                new Airline("Denver", 1, "Light Passenger Jet",
                        LocalTime.of(14, 32, 56), DayOfWeek.MONDAY),

                new Airline("Minsk", 3, "Passenger Turbo Props",
                        LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY),

                new Airline("Denver", 5, "Cargo",
                        LocalTime.of(23, 59, 59), DayOfWeek.MONDAY),
        };
    }

    public void findFlightByDestination(String destination) {
        for (Airline airline : airlinesArray) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airline);
            }
        }
    }

    public void findFlightByDayOfWeek(DayOfWeek dayOfWeek) {
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                System.out.println(airline);
            }
        }
    }

    public void findFlightByDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time) {
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                if (airline.getDepartureTime().isAfter(time)) {
                    System.out.println(airline);
                }
            }
        }
    }

    public void viewAirlines() {
        for (Airline airline : airlinesArray) {
            System.out.println(airline);
        }
    }
}
