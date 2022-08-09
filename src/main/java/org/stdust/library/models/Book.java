package org.stdust.library.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int bookId;

    @NotEmpty(message = "Title can't be empty")
    @Size(min=2,max=30, message="Title should have at least 2 characters and max 30")
    private String name;

    @NotEmpty(message = "Author can't be empty")
    @Size(min=2,max=30, message="Author name should have at least 2 characters and max 30")
    private String author;
    private int yearOfRelease;

    public Book() {}

    public Book(int bookId, String name, String author, int yearOfRelease) {
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

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
