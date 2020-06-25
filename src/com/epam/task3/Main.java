package com.epam.task3;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
   из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
   номеров групп студентов, имеющих оценки, равные только 9 или 10. */
public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[10];

        int[] goodMarksArray = {9, 10, 9, 9, 10};
        int[] badMarksArray = {5, 4, 6, 7, 3};

        studentArray[0] = new Student("Ann A.A.", 1, goodMarksArray);
        studentArray[1] = new Student("Bob B.B.", 2, goodMarksArray);
        studentArray[2] = new Student("Helen H.H.", 1, badMarksArray);
        studentArray[3] = new Student("John J.J.", 2, goodMarksArray);
        studentArray[4] = new Student("Kevin K.K.", 3, badMarksArray);
        studentArray[5] = new Student("Martin M.M.", 3, badMarksArray);
        studentArray[6] = new Student("Nick N.N.", 4, badMarksArray);
        studentArray[7] = new Student("Robin R.R.", 1, badMarksArray);
        studentArray[8] = new Student("Sam S.S.", 2, goodMarksArray);
        studentArray[9] = new Student("Tom T.T.", 3, badMarksArray);

        System.out.println("\nAll students: ");
        ViewAction.viewAllStudent(studentArray);

        System.out.println("\nGood students:");
        ViewAction.viewGoodStudents(studentArray);
    }
}
