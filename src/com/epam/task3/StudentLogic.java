package com.epam.task3;

public class StudentLogic {
    public static boolean checkStudentMarks(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 9 && array[i] != 10) {
                return false;
            }
        }

        return true;
    }
}
