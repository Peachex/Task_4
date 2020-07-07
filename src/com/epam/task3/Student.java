package com.epam.task3;

public class Student {
    private String name;
    private int groupNumber;
    private int[] marksArray;

    public Student(String name, int groupNumber, int[] marksArray) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marksArray = marksArray;
    }

    public boolean isExcellentStudent() {
        for (int mark : this.marksArray) {
            if (mark != 9 && mark != 10) {
                return false;
            }
        }
        return true;
    }

    public static void viewExcellentStudents(Student[] studentsArray) {
        for (Student student : studentsArray) {
            if (student.isExcellentStudent()) {
                student.viewStudent();
            }
        }
    }

    public static void viewAllStudents(Student[] studentsArray) {
        for (Student student : studentsArray) {
            student.viewStudent();
        }
    }

    public void viewStudent() {
        System.out.println("\nName: " + this.name + "\t");
        System.out.println("Group number: " + this.groupNumber + "\t");

        System.out.print("Marks: ");
        for (int mark : this.marksArray) {
            System.out.print(mark + " ");
        }

        System.out.println();
    }
}

