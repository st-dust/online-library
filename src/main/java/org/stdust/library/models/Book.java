package org.stdust.library.models;

public class Book {
    private int bookId;
    private String name;
    private String author;
    private String yearOfRelease;

    public Book() {}

    public Book(int bookId, String name, String author, String yearOfRelease) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
