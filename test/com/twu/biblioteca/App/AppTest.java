package com.twu.biblioteca.App;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

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
    public void out() {
        String welcomeMessage = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!";
        String[] args = new String[1];
        args[0] = welcomeMessage;
        App.main(args);
        assertEquals(welcomeMessage + "\n", outContent.toString());
    }
}
