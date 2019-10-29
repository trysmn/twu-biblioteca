package com.twu.biblioteca.App.MainMenu.Option;

import com.twu.biblioteca.App.MainMenu.Option.Book.Book;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Option {
    private static ArrayList<String> arrayOfTitles = new ArrayList<String>();
    private static AtomicInteger nextOptionListNumber = new AtomicInteger();
    private static ArrayList<Book> bookChoiceList = new ArrayList<Book>();
    private String title;
    private int optionListNumber;

    public Option(String t) {
        this.title = t;
        if (!arrayOfTitles.contains(this.title)) {
            arrayOfTitles.add(this.title);
            this.optionListNumber = nextOptionListNumber.incrementAndGet();
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getOptionListNumber() {
        return this.optionListNumber;
    }

    public static void createListOfBooks() {
        Book testBook1 = new Book("1984", "George Orwell", 1949);
        Book testBook2 = new Book("The Firm", "John Grisham", 1991);
        bookChoiceList.add(testBook1);
        bookChoiceList.add(testBook2);
    }

    public static String showBookChoiceList() {
        StringBuilder stringContent = new StringBuilder();
        stringContent.append("Here is a list of books:" + "\n" + "\n" + "Book List Number: Title - Author | Year Published" + "\n");
        for (Book book : bookChoiceList) {
            String bookInformation = book.getBookListNumber() + ": " + book.getTitle() + " - " + book.getAuthor() + " | " + book.getPublishedYear() + "\n";
            stringContent.append(bookInformation);
        }
        return stringContent.toString();
    }

}
