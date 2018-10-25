package com.epam.task2.view;

import com.epam.task2.entity.Book;


public class BooksView {

    public void printMenu () {

        System.out.println("Welcome to the library menu:");
        System.out.println("1. Search for books by author.");
        System.out.println("2. Search for books by publisher name.");
        System.out.println("3. Find books after a certain year of publication.");
        System.out.println("4. Sort books by publisher name.");
        System.out.println("5. Exit.");
    }

    public void printBooks (String message, Book[] books) {
        System.out.println(message);
        for (Book book: books) {
            System.out.println(book);

        }
    }
    public void printMessage (String message) {
        System.out.println(message);

    }
}
