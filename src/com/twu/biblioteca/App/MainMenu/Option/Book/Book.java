package com.twu.biblioteca.App.MainMenu.Option.Book;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private static ArrayList<String> arrayOfTitles = new ArrayList<String>();
    private static AtomicInteger nextBookListNumber = new AtomicInteger();
    private int bookListNumber;
    private String title;
    private String author;
    private int publishedYear;

    public Book(String t, String a, int p) {
        this.title = t;
        if (!arrayOfTitles.contains(this.title)) {
            arrayOfTitles.add(this.title);
            this.author = a;
            this.publishedYear = p;
            this.bookListNumber = nextBookListNumber.incrementAndGet();
        }
    }

    public int getBookListNumber() {
        return this.bookListNumber;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }
}
