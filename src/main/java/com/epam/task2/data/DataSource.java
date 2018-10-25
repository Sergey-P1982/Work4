package com.epam.task2.data;

import com.epam.task2.entity.Book;

public class DataSource {
    public static Book[] getBooks() {
        return new Book[]{
                new Book("Title1", "Shevchenko", "TIME", 1920, 320, 450.0),
                new Book("Title2", "Tkachenko", "DUH", 1978, 420, 480.0),
                new Book("Title3", "Ivanov", "FACT", 2012, 520, 150.0),
                new Book("Title4", "Petrov", "TEZA", 2013, 620, 450.0),
                new Book("Title5", "Franko", "VELES", 1982, 120, 350.0),

        };
    }
}
