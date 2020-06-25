package com.epam.task3;

public class Student {
    private String name;
    private int groupNumber;
    private int[] marksArray = new int[5];

    public Student(String name, int groupNumber, int[] marksArray) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marksArray = marksArray;
    }

    public String getName() {
        return this.name;
    }

    public int getGroupNumber() {
        return this.groupNumber;
    }

    public int[] getMarksArray() {
        return this.marksArray;
    }
}
