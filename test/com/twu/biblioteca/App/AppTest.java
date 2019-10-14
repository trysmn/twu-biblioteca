package com.twu.biblioteca.App;

import com.twu.biblioteca.App.Book.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldShowWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!";
        App.showWelcomeMessage();
        assertThat(outContent.toString(), is(welcomeMessage + "\n"));
    }

    @Test
    public void shouldShowBookListMessage() {
        String bookListMessage = "Here is a list of books:" + "\n" + "\n" + "Id: Title - Author | Year Published";
        App.showBookListMessage();
        assertThat(outContent.toString(), is(bookListMessage + "\n"));
    }

    @Test
    public void shouldShowAListOfBooks() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book testBook1 = new Book("1984", "George Orwell", 1949);
        Book testBook2 = new Book("The Firm", "John Grisham", 1991);
        bookList.add(testBook1);
        bookList.add(testBook2);
        App.showBookList(bookList);
        assertThat(outContent.toString(), is("1: 1984 - George Orwell | 1949" + "\n" + "2: The Firm - John Grisham | 1991" + "\n"));
    }
}
