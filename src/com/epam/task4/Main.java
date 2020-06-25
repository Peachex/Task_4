package com.epam.task4;

import java.util.Scanner;

/* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
   номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
   назначения должны быть упорядочены по времени отправления. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Train[] trainsArray = new Train[5];

        trainsArray[0] = new Train("Minsk", 2, new Time(19, 15, 43));
        trainsArray[1] = new Train("Vitebsk", 5, new Time(10, 39, 10));
        trainsArray[2] = new Train("Mogilev", 3, new Time(9, 45, 31));
        trainsArray[3] = new Train("Vitebsk", 1, new Time(8, 23, 46));
        trainsArray[4] = new Train("Minsk", 4, new Time(16, 54, 23));

        System.out.println("\nAll trains: ");
        ViewAction.viewTrains(trainsArray);

        System.out.println("\nInput train number to see information about this train: ");
        ViewAction.viewTrain(trainsArray, TrainLogic.findTrainIndex(trainsArray, in.nextInt()));

        System.out.println("\nSort by number: ");
        TrainLogic.sortByNumber(trainsArray);
        ViewAction.viewTrains(trainsArray);

        System.out.println("\nSort by destination: ");
        TrainLogic.sortByDestination(trainsArray);
        ViewAction.viewTrains(trainsArray);
    }
}
