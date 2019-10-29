package com.twu.biblioteca.App;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
    public void shouldShowAMainMenu() {
        try {
            Class.forName("com.twu.biblioteca.App.MainMenu.MainMenu");
        } catch (ClassNotFoundException e) {
            Assert.fail("should render the MainMenu");
        }
    }
}
