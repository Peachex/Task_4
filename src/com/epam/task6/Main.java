package com.epam.task6;

/* 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
   изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
   недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
   заданное количество часов, минут и секунд. */
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(11, 22, 33);
        Time time2 = new Time(33, 66, 99);

        System.out.println("Default time:");
        view(time1);
        view(time2);

        time1.setHours(0);
        time1.setMinutes(1);
        time1.setSeconds(2);

        time2.setHours(22);
        time2.setMinutes(11);
        time2.setSeconds(0);

        System.out.println("\nSet time:");
        view(time1);
        view(time2);
    }

    public static void view(Time time) {
        System.out.println(time.getHours() + "h " + time.getMinutes() + "min " + time.getSeconds() + "s");
    }
}
