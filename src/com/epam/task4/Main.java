package com.epam.task4;

import java.time.LocalTime;
import java.util.Scanner;

/* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
   номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
   назначения должны быть упорядочены по времени отправления. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Train[] trainsArray = {
                new Train("Minsk", 2, LocalTime.of(19, 15, 43)),
                new Train("Vitebsk", 5, LocalTime.of(10, 39, 10)),
                new Train("Mogilev", 3, LocalTime.of(9, 45, 31)),
                new Train("Vitebsk", 1, LocalTime.of(8, 23, 46)),
                new Train("Minsk", 4, LocalTime.of(16, 54, 23)),
        };

        System.out.println("\nAll trains: ");
        Train.viewAllTrains(trainsArray);

        System.out.println("\nInput train number to see information about this train: ");
        Train.findTrainByNumber(trainsArray, in.nextInt());

        System.out.println("\nSort by number: ");
        Train.sortByNumber(trainsArray);
        Train.viewAllTrains(trainsArray);

        System.out.println("\nSort by destination: ");
        Train.sortByDestination(trainsArray);
        Train.viewAllTrains(trainsArray);
    }
}
