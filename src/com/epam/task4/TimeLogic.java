package com.epam.task4;

public class TimeLogic {
    public static boolean compareTime(Time time1, Time time2) {
        if (time1.getHours() > time2.getHours()) {
            return true;
        }

        if (time1.getHours() == time2.getHours()) {
            if (time1.getMinutes() > time2.getMinutes()) {
                return true;
            }
        }

        if (time1.getHours() == time2.getHours() && time1.getMinutes() == time2.getMinutes()) {
            if (time1.getSeconds() > time2.getSeconds()) {
                return true;
            }
        }

        return false;
    }
}
