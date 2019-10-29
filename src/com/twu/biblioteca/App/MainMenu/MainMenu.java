package com.twu.biblioteca.App.MainMenu;

import com.twu.biblioteca.App.MainMenu.Option.Option;

import java.util.ArrayList;

public class MainMenu {
    private static ArrayList<Option> optionList = new ArrayList<Option>();

    public static void createListOfOptions() {
        Option listOfBooksOption = new Option("List of books");
        optionList.add(listOfBooksOption);
    }

    public static String showPromptToChooseFromListOfOptions() {
        return "Please choose from one of the following options:" + "\n";
    }

    public static String showListOfOptions() {
        StringBuilder stringContent = new StringBuilder();
        for (Option option : optionList) {
            String optionInformation =  "[" + option.getOptionListNumber() + "]: " + option.getTitle();
            stringContent.append(optionInformation);
        }
        return stringContent.toString();
    }

    public static String selectOptionNumber(int optionNumber) {
        if (optionNumber == 1) {
            return Option.showBookChoiceList();
        } else {
            return invalidChoiceSelected();
        }
    }

    private static String invalidChoiceSelected() {
        return "Sorry, that's an invalid selection. Please try again.";
    }
}
