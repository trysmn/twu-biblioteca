package com.twu.biblioteca.App.MainMenu.Option.Book;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;

public class BookTest {
    @Test
    public void shouldHaveATitleAnAuthorAndYearPublished() {
        Book testBook = new Book("1984", "George Orwell", 1949);
        assertThat(testBook, hasProperty("bookListNumber"));
        assertThat(testBook, hasProperty("title"));
        assertThat(testBook, hasProperty("author"));
        assertThat(testBook, hasProperty("publishedYear"));
    }

    @Test
    public void shouldHaveItsAssignedPropertyValues() {
        Book testBook = new Book("1984", "George Orwell", 1949);
        assertThat(testBook.getBookListNumber(), is(1));
        assertThat(testBook.getTitle(), is("1984"));
        assertThat(testBook.getAuthor(), is("George Orwell"));
        assertThat(testBook.getPublishedYear(), is(1949));
    }
}
