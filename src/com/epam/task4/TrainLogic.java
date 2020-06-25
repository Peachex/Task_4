package com.epam.task4;

public class TrainLogic {
    public static void sortByNumber(Train[] trainsArray) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < trainsArray.length - 1; i++) {
                if (trainsArray[i].getTrainNumber() > trainsArray[i + 1].getTrainNumber()) {
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
                if (trainsArray[i].getDestination().compareToIgnoreCase(trainsArray[i + 1].getDestination()) > 0) {
                    swap(trainsArray, i);
                    flag = true;

                } else {
                    if (trainsArray[i].getDestination().compareToIgnoreCase(trainsArray[i + 1].getDestination()) == 0) {
                        if (TimeLogic.compareTime(trainsArray[i].getSendTime(), trainsArray[i + 1].getSendTime())) {
                            swap(trainsArray, i);
                            flag = true;
                        }
                    }
                }
            }
        }
    }

    public static int findTrainIndex(Train[] trainsArray, int trainNumber) {
        for (int i = 0; i < trainsArray.length; i++) {
            if (trainsArray[i].getTrainNumber() == trainNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void swap(Train[] trainsArray, int index) {
        Train temp = trainsArray[index];
        trainsArray[index] = trainsArray[index + 1];
        trainsArray[index + 1] = temp;
    }
}
