package com.epam.task6;

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
        return this.hours;
    }

    public void setHours(int hours) {
        if (hours < 24 && hours >= 0) {
            this.hours = hours;

        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;

        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;

        } else {
            this.seconds = 0;
        }
    }

    public void changeTimeHours(int hours) {
        this.hours += hours;
    }

    public void changeTimeMinutes(int minutes) {
        this.minutes += minutes;

        while (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    public void changeTimeSeconds(int seconds) {
        this.seconds += seconds;

        while (this.seconds >= 60) {
            this.minutes++;
            this.seconds -= 60;
        }

        while (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    public void viewTime() {
        System.out.println(this.hours + "h " + this.minutes + "min " + this.seconds + "s");
    }
}
