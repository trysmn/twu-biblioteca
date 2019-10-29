package com.twu.biblioteca.App.MainMenu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

public class MainMenuTest {
    @Test
    public void shouldShowPromptToChooseFromListOfOptions() {
        String prompt = "Please choose from one of the following options:" + "\n";
        assertThat(MainMenu.showPromptToChooseFromListOfOptions(), is(prompt));
    }

    @Test
    public void shouldShowAListOfOptions() {
        MainMenu.createListOfOptions();
        assertThat(MainMenu.showListOfOptions(), is(not("")));
        assertThat(MainMenu.showListOfOptions(), is("[1]: List of books"));
    }

    @Test
    public void shouldReturnAnInvalidChoiceMessageGivenInvalidOptionNumber() {
        int invalidOptionNumber = 0;
        assertThat(MainMenu.selectOptionNumber(invalidOptionNumber),
                is("Sorry, that's an invalid selection. Please try again."));
    }
}
