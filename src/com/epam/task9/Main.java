package com.epam.task9;

/* 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
   метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
   методами. Задать критерии выбора данных и вывести эти данные на консоль.

   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
   Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года. */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("\nAll books:");
        library.view();

        String authorName = "Pine";

        System.out.println("\nBook(s), written by " + authorName + ":");
        library.findByAuthor(authorName);

        String publishHouseName = "Eleven";

        System.out.println("\nBook(s), published by " + publishHouseName + ":");
        library.findByPublishHouse(publishHouseName);

        int year = 2000;

        System.out.println("\nBook(s), published after " + year + ":");
        library.findByPublishYear(year);
    }
}
