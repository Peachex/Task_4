package com.epam.task3;

public class ViewAction {
    public static void viewAllStudent(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("\nName: " + studentArray[i].getName() + "\t");
            System.out.println("Group number: " + studentArray[i].getGroupNumber() + "\t");

            System.out.print("Marks: ");
            for (int j = 0; j < studentArray[i].getMarksArray().length; j++) {
                System.out.print(studentArray[i].getMarksArray()[j] + " ");
            }

            System.out.println();
        }
    }

    public static void viewGoodStudents(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            if (StudentLogic.checkStudentMarks(studentArray[i].getMarksArray())) {
                System.out.println("\nName: " + studentArray[i].getName() + "\t");
                System.out.println("Group number: " + studentArray[i].getGroupNumber() + "\t");

                System.out.print("Marks: ");
                for (int j = 0; j < studentArray[i].getMarksArray().length; j++) {
                    System.out.print(studentArray[i].getMarksArray()[j] + " ");
                }

                System.out.println();
            }
        }
    }
}