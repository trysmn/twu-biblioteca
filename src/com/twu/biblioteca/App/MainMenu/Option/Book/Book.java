package com.twu.biblioteca.App.Option.Book;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private int id;
    private static AtomicInteger nextId = new AtomicInteger();
    private String title;
    private String author;
    private int publishedYear;

    public Book(String t, String a, int p) {
        id = nextId.incrementAndGet();
        title = t;
        author = a;
        publishedYear = p;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
