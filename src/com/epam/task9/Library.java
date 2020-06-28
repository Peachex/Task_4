package com.epam.task9;

public class Library {
    private Book[] booksArray;

    public Library() {
        booksArray = new Book[]{new Book(1998, 321, 15.44, "ICE", "Pine",
                "Eleven", "Soft"),

                new Book(2010, 196, 12, "RED APPLE", "Orange", "One",
                        "Soft"),

                new Book(1930, 982, 19.99, "SUN AFTER MIDNIGHT", "Lemon",
                        "One", "Soft"),

                new Book(2019, 2000, 65.99, "WATER...", "Pine", "One",
                        "Solid"),

                new Book(2002, 68, 7.44, "WORLD", "Lemon", "Eleven",
                        "Solid")
        };
    }

    public void findByAuthor(String authors) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getAuthors().equalsIgnoreCase(authors)) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void findByPublishHouse(String publishHouse) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getPublishHouse().equalsIgnoreCase(publishHouse)) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void findByPublishYear(int year) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getPublishYear() > year) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void view () {
        for (Book book : booksArray) {
            System.out.println(book);
        }
    }
}
