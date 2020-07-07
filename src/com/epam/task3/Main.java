package com.epam.task3;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
   из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
   номеров групп студентов, имеющих оценки, равные только 9 или 10. */
public class Main {
    public static void main(String[] args) {
        int[] goodMarksArray = {9, 10, 9, 9, 10};
        int[] badMarksArray = {5, 4, 6, 7, 3};

        Student[] studentsArray = {
                new Student("Ann A.A.", 1, goodMarksArray),
                new Student("Bob B.B.", 2, goodMarksArray),
                new Student("Helen H.H.", 1, badMarksArray),
                new Student("John J.J.", 2, goodMarksArray),
                new Student("Kevin K.K.", 3, badMarksArray),
                new Student("Martin M.M.", 3, badMarksArray),
                new Student("Nick N.N.", 4, badMarksArray),
                new Student("Robin R.R.", 1, badMarksArray),
                new Student("Sam S.S.", 2, goodMarksArray),
        };

        System.out.println("\nAll students: ");
        Student.viewAllStudents(studentsArray);

        System.out.println("\nGood students:");
        Student.viewExcellentStudents(studentsArray);
    }
}
