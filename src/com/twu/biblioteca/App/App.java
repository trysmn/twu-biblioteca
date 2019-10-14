package com.twu.biblioteca.App;

import com.twu.biblioteca.App.Book.Book;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        showWelcomeMessage();
        showBookListMessage();
        ArrayList<Book> bookList = createBookList();
        showBookList(bookList);
    }

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
    }

    public static void showBookListMessage() {
        System.out.println("Here is a list of books:");
        System.out.println();
        System.out.println("Id: Title - Author | Year Published");
    }

    public static void showBookList(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.getId() + ": " + book.getTitle() + " - " + book.getAuthor() + " | " + book.getPublishedYear());
        }
    }

    public static ArrayList<Book> createBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book testBook1 = new Book("1984", "George Orwell", 1949);
        Book testBook2 = new Book("The Firm", "John Grisham", 1991);
        bookList.add(testBook1);
        bookList.add(testBook2);
        return bookList;
    }
}
