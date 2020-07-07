package com.epam.task4;

import java.time.LocalTime;

public class Train {
    private String destination;
    private int trainNumber;
    private LocalTime departureTime;

    public Train(String destination, int trainNumber, LocalTime departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public static void sortByNumber(Train[] trainsArray) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < trainsArray.length - 1; i++) {
                if (trainsArray[i].trainNumber > trainsArray[i + 1].trainNumber) {
                    swap(trainsArray, i);
                    flag = true;
                }
            }
        }
    }

    public static void sortByDestination(Train[] trainsArray) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < trainsArray.length - 1; i++) {
                if (trainsArray[i].destination.compareToIgnoreCase(trainsArray[i + 1].destination) > 0) {
                    swap(trainsArray, i);
                    flag = true;

                } else {
                    if (trainsArray[i].destination.compareToIgnoreCase(trainsArray[i + 1].destination) == 0) {
                        if (trainsArray[i].departureTime.isAfter(trainsArray[i + 1].departureTime)) {
                            swap(trainsArray, i);
                            flag = true;
                        }
                    }
                }
            }
        }
    }

    public static void findTrainByNumber(Train[] trainsArray, int trainNumber) {
        for (Train train : trainsArray) {
            if (train.trainNumber == trainNumber) {
                train.view();
                return;
            }
        }

        System.out.println("Couldn't find such train...");
    }

    public static void viewAllTrains(Train[] trainsArray) {
        for (Train train : trainsArray) {
            train.view();
        }
    }

    public static void swap(Train[] trainsArray, int index) {
        Train temp = trainsArray[index];
        trainsArray[index] = trainsArray[index + 1];
        trainsArray[index + 1] = temp;
    }

    public void view() {
        System.out.println("\nDestination: " + this.destination);
        System.out.println("Train number: " + this.trainNumber);
        System.out.println("Departure time: " + this.departureTime);
    }
}
