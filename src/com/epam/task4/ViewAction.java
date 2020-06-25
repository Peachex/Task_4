package com.epam.task4;

public class ViewAction {
    public static void viewTrains(Train[] trainsArray) {
        for (int i = 0; i < trainsArray.length; i++) {
            System.out.println("\nDestination: " + trainsArray[i].getDestination());
            System.out.println("Train number: " + trainsArray[i].getTrainNumber());
            viewSendTime(trainsArray[i]);
        }
    }

    public static void viewTrain(Train[] trainsArray, int index) {
        if (index != -1) {
            System.out.println("\nDestination: " + trainsArray[index].getDestination());
            System.out.println("Train number: " + trainsArray[index].getTrainNumber());
            viewSendTime(trainsArray[index]);
        } else {
            System.out.println("\nCouldn't find...");
        }
    }

    public static void viewSendTime(Train train) {
        System.out.println("Send time: " + train.getSendTime().getHours() + "h " + train.getSendTime().getMinutes() + "m " +
                train.getSendTime().getSeconds() + "s");
    }
}
