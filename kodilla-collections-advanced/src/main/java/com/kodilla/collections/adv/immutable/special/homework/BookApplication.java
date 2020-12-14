package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("The Shining", "Zdewen King");
        Book book2 = bookManager.createBook("Mistery", "Stephen King");
        Book book3 = bookManager.createBook("Carrie", "Stephen king");
        Book book4 = bookManager.createBook("Carrie", "Stephen king");
        Book book5 = bookManager.createBook("The Shining", "Sthepen King");

        for (Book book : bookManager.getBooks()) {
            System.out.println(book1 == book);
        }

//        System.out.println(book1 == book2);
//        System.out.println(book1 == book3);
//        System.out.println(book1 == book4);
//        System.out.println(book1 == book5);
//
//        System.out.println(book2 == book3);
//        System.out.println(book2 == book4);
//        System.out.println(book2 == book5);
//
//        System.out.println(book3 == book4);
//        System.out.println(book3 == book5);
//
//        System.out.println(book4 == book5);
    }
}