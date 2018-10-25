package com.epam.task2.model;

import com.epam.task2.data.DataSource;
import com.epam.task2.entity.Book;

import java.util.Arrays;

public class Books {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getByAuthor (String author) {
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i< books.length; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                temp[counter++] = books[i];
            }
        }
        return Arrays.copyOf(temp, counter);
    }
    public Book[] getByPublisher (String publisher) {
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i< books.length; i++) {
            if (books[i].getPublisher().equalsIgnoreCase(publisher)) {
                temp[counter++] = books[i];
            }
        }
        return Arrays.copyOf(temp, counter);
    }
    public Book[] getAfterYearRelease (int year) {
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i< books.length; i++) {
            if (books[i].getYear()>year) {
                temp[counter++] = books[i];
            }
        }
        return Arrays.copyOf(temp, counter);
    }
    public Book[] sortByPublisher () {
        Book[] temp = DataSource.getBooks();
        Arrays.sort(temp, new PublisherComparator());

        return temp;
    }
}
