package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        //Displays intro graphic
        ui.displayTitleScreen();

        //displays.. everything else
        ui.showHomeScreen();
    }
}
