package com.epam.task2.data;

import com.epam.task2.entity.Book;

import java.io.*;

public class DataSource {
    public static Book[] readAndGetBooksFromTxtFile() throws IOException {
        String inFileName = "Books_Txt_File.txt";

        BufferedReader reader = null;
        int count = 0;
        String inputLine;
        try {
            reader = new BufferedReader(new FileReader(inFileName));
            while ((reader.readLine()) != null) {
                count++;
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            reader.close();
        }
        Book[] books = new Book[count];


        try {
            reader = new BufferedReader(new FileReader(inFileName));
            for (int i = 0; i < books.length; i++) {
                inputLine = reader.readLine();
                String[] token = inputLine.split(",");
                if (token.length == 6) {
                    books[i] = new Book(token[0].trim(), token[1].trim(), token[2].trim(), Integer.parseInt(token[3].trim()),
                            Integer.parseInt(token[4].trim()), Double.parseDouble(token[5].trim()));
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (NullPointerException e1) {
            e1.printStackTrace();
        } finally {
            reader.close();

        }
        return books;
    }

}


//    public static Book[] getBooks() {
//        return new Book[]{
//                new Book("Title1", "Shevchenko", "TIME", 1920, 320, 450.0),
//                new Book("Title2", "Tkachenko", "DUH", 1978, 420, 480.0),
//                new Book("Title3", "Ivanov", "FACT", 2012, 520, 150.0),
//                new Book("Title4", "Petrov", "TEZA", 2013, 620, 450.0),
//                new Book("Title5", "Franko", "VELES", 1982, 120, 350.0),
//
//        };
//    }
//
//    public static void writeTxtFile(Book[] books) throws IOException {
//        String txtFileName = "Books_Txt_File.txt";
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txtFileName))) {
//            int i = 1;
//            for (Book book : books) {
//                writer.write(i + ". " + book.getName() + ", " + book.getAuthor() +
//                        ", " + book.getPublisher() + ", " + book.getYear() + ", " + book.getPages() +
//                        ", " + book.getPrice() + "\n");
//                i++;
//            }
//            System.out.println("Recording into txt file " + txtFileName + " successfully completed ");
//        } catch (IOException e) {
//            System.out.println("Exception: " + e);
//        }
//    }

