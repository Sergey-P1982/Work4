package com.epam.task2;

import com.epam.task2.controller.Controller;

public class Main {
    public static void main(String[] args) {
        new Controller().run();
    }
}
//OUTPUT:
//        Welcome to the library menu:
//        1. Search for books by author.
//        2. Search for books by publisher name.
//        3. Find books after a certain year of publication.
//        4. Sort books by publisher name.
//        5. Exit.
//        Choose a menu item (1-5):
//        2
//        Enter publisher name: МС
//        No books published by МС
//        Back to menu? Y/N
//        y
//        Welcome to the library menu:
//        1. Search for books by author.
//        2. Search for books by publisher name.
//        3. Find books after a certain year of publication.
//        4. Sort books by publisher name.
//        5. Exit.
//        Choose a menu item (1-5):
//        2
//        Enter publisher name: BX
//        Publisher - BX:
//        Book{name='Title2', author='Shevchuk', publisher='BX', year=2011, pages=420, price=480.0}
//        Back to menu? Y/N
//        Y
//        Welcome to the library menu:
//        1. Search for books by author.
//        2. Search for books by publisher name.
//        3. Find books after a certain year of publication.
//        4. Sort books by publisher name.
//        5. Exit.
//        Choose a menu item (1-5):
//        3
//        Enter release year: 2014
//        Books published after 2014 :
//        Book{name='Title6', author='Petrov', publisher='DXV', year=2015, pages=220, price=450.0}
//        Book{name='Title7', author='Tkachenko', publisher='TXV', year=2016, pages=250, price=750.0}
//        Book{name='Title8', author='Ivanenko', publisher='KXV', year=2017, pages=360, price=950.0}
//        Book{name='Title9', author='Shevchenko', publisher='BBV', year=2018, pages=770, price=250.0}
//        Book{name='Title10', author='Tarasenko', publisher='AAV', year=2018, pages=680, price=1450.0}
//        Back to menu? Y/N
//        Y
//        Welcome to the library menu:
//        1. Search for books by author.
//        2. Search for books by publisher name.
//        3. Find books after a certain year of publication.
//        4. Sort books by publisher name.
//        5. Exit.
//        Choose a menu item (1-5):
//        4
//        Books after sorting by publisher:
//        Book{name='Title10', author='Tarasenko', publisher='AAV', year=2018, pages=680, price=1450.0}
//        Book{name='Title5', author='Sidorenko', publisher='AXV', year=2014, pages=120, price=350.0}
//        Book{name='Title9', author='Shevchenko', publisher='BBV', year=2018, pages=770, price=250.0}
//        Book{name='Title4', author='Petrenko', publisher='BV', year=2013, pages=620, price=450.0}
//        Book{name='Title2', author='Shevchuk', publisher='BX', year=2011, pages=420, price=480.0}
//        Book{name='Title1', author='Shevchenko', publisher='BXV', year=1970, pages=320, price=450.0}
//        Book{name='Title6', author='Petrov', publisher='DXV', year=2015, pages=220, price=450.0}
//        Book{name='Title8', author='Ivanenko', publisher='KXV', year=2017, pages=360, price=950.0}
//        Book{name='Title7', author='Tkachenko', publisher='TXV', year=2016, pages=250, price=750.0}
//        Book{name='Title3', author='Ivanov', publisher='XV', year=2012, pages=520, price=150.0}
//        Back to menu? Y/N
//        y
//        Welcome to the library menu:
//        1. Search for books by author.
//        2. Search for books by publisher name.
//        3. Find books after a certain year of publication.
//        4. Sort books by publisher name.
//        5. Exit.
//        Choose a menu item (1-5):
//        5
//        Bye!
//
//        Process finished with exit code 0
