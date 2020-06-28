package com.epam.task9;

public class Book {
    private static int count = 1;
    private int id;

    private int publishYear;
    private int pagesNumber;
    private double price;

    private String title;
    private String authors;
    private String publishHouse;
    private String coverType;

    public Book(int publishYear, int pagesAmount, double price, String title, String authors, String publishHouse, String coverType) {
        this.id = count++;
        this.publishYear = publishYear;
        this.pagesNumber = pagesAmount;
        this.price = price;
        this.title = title;
        this.authors = authors;
        this.publishHouse = publishHouse;
        this.coverType = coverType;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nTitle: " + title + "\nAuthors: " + authors + "\nPublish year: " + publishYear +
                "\nPublish house: " + publishHouse + "\nPages number: " + pagesNumber + "\nCover type: " +
                coverType + "\nPrice: " + price;
    }
}
