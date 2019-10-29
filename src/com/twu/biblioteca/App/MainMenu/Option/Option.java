package com.twu.biblioteca.App.Option;

import com.twu.biblioteca.App.Option.Book.Book;

import java.util.ArrayList;

public class Option {
    private String title;
    private ArrayList<Book> choices;

    public Option(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        StringBuilder stringContent = new StringBuilder();
        for (Book book : choices) {
            String bookInformation = book.getId() + ": " + book.getTitle() + " - " + book.getAuthor() + " | " + book.getPublishedYear() + "\n";
            stringContent.append(bookInformation);
        };
        return stringContent.toString();
    }
}
