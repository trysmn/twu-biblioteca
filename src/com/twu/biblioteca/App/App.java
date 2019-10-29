package com.twu.biblioteca.App;

import com.twu.biblioteca.App.MainMenu.MainMenu;
import com.twu.biblioteca.App.MainMenu.Option.Book.Book;
import com.twu.biblioteca.App.MainMenu.Option.Option;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        showWelcomeMessage();
        System.out.println(MainMenu.showPromptToChooseFromListOfOptions());
        MainMenu.createListOfOptions();
        System.out.println(MainMenu.showListOfOptions());
        Scanner scanner = new Scanner(System.in);
        int selectedOptionNumber = scanner.nextInt();
        Option.createListOfBooks();
        System.out.println(MainMenu.selectOptionNumber(selectedOptionNumber));
    }

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!");
    }
}
