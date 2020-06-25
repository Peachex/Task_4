package com.epam.task4;

public class Train {
    private String destination;
    private int trainNumber;
    private Time sendTime;

    public Train(String destination, int trainNumber, Time sendTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.sendTime = sendTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Time getSendTime() {
        return sendTime;
    }
}
