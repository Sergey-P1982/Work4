package com.epam.task2.controller;

import com.epam.task2.data.DataSource;
import com.epam.task2.entity.Book;
import com.epam.task2.model.Books;
import com.epam.task2.view.BooksView;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private Books model = new Books();
    private BooksView view = new BooksView();
    Scanner scan = new Scanner(System.in);

    public void run() throws IOException {

        model.setBooks(DataSource.readAndGetBooksFromTxtFile());
        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (1-5):");
            int menuItem = getMenuItem();
            while (menuItem > 5 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu press 'Y'/ Or any other key to exit program");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private void executeMenuItem(int number) throws IOException {
        switch (number) {
            case (1):
                view.printMessage("Enter author name: ");
                String author = scan.next();
                searchByAuthor(author);
                break;
            case (2):
                view.printMessage("Enter publisher name: ");
                String publisher = scan.next();
                searchByPublisher(publisher);
                break;
            case (3):
                view.printMessage("Enter release year: ");
                int releasYear = scan.nextInt();
                searchByYearRelease(releasYear);
                break;
            case (4):
                sortByPublisher();
                break;
            case (5):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                view.printMessage("Wrong number. Try again. ");
                break;
        }
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();

    }

    private void searchByAuthor(String author) {
        Book[] result = model.getByAuthor(author);
        if (result.length == 0) {
            view.printMessage("Not found any books by author " + author);
        } else {
            view.printBooks("Author - " + author + ":", result);

        }
    }

    private void searchByPublisher(String publisher) {
        Book[] result = model.getByPublisher(publisher);
        if (result.length == 0) {
            view.printMessage("No books published by " + publisher);
        } else {
            view.printBooks("Publisher - " + publisher + ": ", result);

        }
    }

    private void searchByYearRelease(int year) {
        Book[] result = model.getAfterYearRelease(year);
        if (result.length == 0) {
            view.printMessage("No books found after " + year);
        } else {
            view.printBooks("Books published after " + year + " :", result);

        }
    }

    private void sortByPublisher() throws IOException {
        view.printBooks("Books after sorting by publisher: ", model.sortByPublisher());

    }
}


