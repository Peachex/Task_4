package com.epam.task4;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 24 && hours >= 0) {
            this.hours = hours;

        } else {
            this.hours = 0;
        }

        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;

        } else {
            this.minutes = 0;
        }

        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;

        } else {
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
