package com.epam.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private String planeType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, String planeType, LocalTime departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return this.planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String toString() {
        return "\nDestination: " + this.destination + "\nFlight number: " + this.flightNumber + "\nPlane type: " + this.planeType
                + "\nDeparture time: " + this.departureTime + "\nDay of week: " + this.dayOfWeek;
    }
}
