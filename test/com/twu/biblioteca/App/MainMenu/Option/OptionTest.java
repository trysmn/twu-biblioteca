package com.twu.biblioteca.App.MainMenu.Option;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class OptionTest {
    private Option createFakeOption() {
        return new Option("Option One");
    }

    @Test
    public void shouldHaveAnIdATitleAndAnAction() {
        Option newOption = createFakeOption();
        assertThat(newOption, hasProperty("optionListNumber"));
        assertThat(newOption, hasProperty("title"));
    }

    @Test
    public void shouldHaveCorrectTitleAndId() {
        Option newOption = createFakeOption();
        assertThat(newOption.getTitle(), is("Option One"));
        assertThat(newOption.getOptionListNumber(), is(1));
    }

    @Test
    public void shouldShowItsContentWhenSelected() {
        Option.createListOfBooks();
        assertThat(Option.showBookChoiceList(), is(
                "Here is a list of books:" + "\n" + "\n" +
                "Book List Number: Title - Author | Year Published" + "\n" +
                "1: 1984 - George Orwell | 1949" + "\n" +
                "2: The Firm - John Grisham | 1991" + "\n"
        ));
    }
}
