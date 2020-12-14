package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private Set<Book> books  = new HashSet<>();
    public Book createBook(String title, String author) {

        Book book = new Book(title, author);
        if (books.size() == 0) {
            books.add(book);
            return book;
        }

        boolean bookAlreadyExist = false;
        for(Book currentBook: books){
            if ( currentBook.getTitle() == title && currentBook.getAuthor() == author){
                System.out.println("Book: " + book.getTitle() + " already exists");
                bookAlreadyExist = true;
                return currentBook;            }
        }
        if(!bookAlreadyExist){
            books.add(book);
        }
        return book;
    }

    public Set<Book> getBooks() {
        return books;
    }
}