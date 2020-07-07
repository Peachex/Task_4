package com.epam.task2;

/* 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
   конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей
   экземпляра класса. */
public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2();

        view(test2, true);

        test2 = new Test2(32, 21);

        view(test2, true);

        test2.setA(46);
        test2.setB(64);

        view(test2, false);
    }

    public static void view(Test2 test2, boolean isDefault) {
        if (isDefault) {
            System.out.println("default: a = " + test2.getA());
            System.out.println("default: b = " + test2.getB() + "\n");
        } else {
            System.out.println("not default: a = " + test2.getA());
            System.out.println("not default: b = " + test2.getB());
        }
    }
}
