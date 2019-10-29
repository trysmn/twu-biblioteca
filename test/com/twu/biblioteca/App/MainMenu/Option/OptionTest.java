package com.twu.biblioteca.App.Option;

import com.twu.biblioteca.App.Option.Book.Book;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OptionTest {
    private ArrayList<Book> createBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book testBook1 = new Book("1984", "George Orwell", 1949);
        Book testBook2 = new Book("The Firm", "John Grisham", 1991);
        bookList.add(testBook1);
        bookList.add(testBook2);
        return bookList;
    }

    @Test
    public void shouldHaveATitle() {
        ArrayList<Book> bookList = createBookList();
        Option newOption = new Option("List of books", bookList);
        assertThat(newOption.getTitle(), is("List of books"));
    }

    @Test
    public void shouldShowItsContentWhenSelected() {
        ArrayList<Book> bookList = createBookList();
        Option newOption = new Option("List of books", bookList);
        assertThat(newOption.getContent(), is("1: 1984 - George Orwell | 1949" + "\n" + "2: The Firm - John Grisham | 1991" + "\n"));
    }
}
