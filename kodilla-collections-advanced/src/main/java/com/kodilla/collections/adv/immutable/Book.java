package com.kodilla.collections.adv.immutable;

import java.util.Objects;

public class Book {
    // pola
    private String title;
    private String author;

    // konstruktor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() { // public final String getAuthor
        return author;
    }

    public String getTitle() { // public final String getTitle
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}