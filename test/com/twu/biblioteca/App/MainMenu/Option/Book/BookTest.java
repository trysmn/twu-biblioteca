package com.twu.biblioteca.App.Option.Book;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class BookTest {
    private Book createBook(String title, String author, int publishedYear) {
        return new Book(title, author, publishedYear);
    }

    @Test
    public void shouldHaveATitleAnAuthorAndYearPublished() {
        Book testBook = createBook("1984", "George Orwell", 1949);
        assertThat(testBook, hasProperty("id"));
        assertThat(testBook, hasProperty("title"));
        assertThat(testBook, hasProperty("author"));
        assertThat(testBook, hasProperty("publishedYear"));
    }
}
