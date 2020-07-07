package com.epam.task5;

/* 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
   на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
   произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
   позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. */
public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(0, -100, 100);
        Counter counter3 = new Counter(-100, -10, 10);

        System.out.println("Before increase/decrease:");
        counter1.view();
        counter2.view();
        counter3.view();

        for (int i = 0; i < 100; i++) {
            counter1.increase();
            counter2.decrease();
        }

        System.out.println("\nAfter increase/decrease:");
        counter1.view();
        counter2.view();
        counter3.view();
    }
}
