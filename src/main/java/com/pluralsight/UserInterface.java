package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Order currentOrder;
    private Scanner scanner = new Scanner(System.in);

    // Home screen to start a new order or exit
    public void showHomeScreen() {
        System.out.println("Welcome to ...");
        wait(900);
        displayTitleScreen();
        System.out.println("1) Start a new order");
        System.out.println("0) Exit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            currentOrder = new Order();
            showOrderScreen();
        } else if (choice == 0) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    // Order screen options
    public void showOrderScreen() {
        // Decide whether or not to be "quirky" or straightforward here. I think straight forward works but eh.
        System.out.println("Order Options:");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showAddSandwichScreen();
                break;
            case 2:
                showAddDrinkScreen();
                break;
            case 3:
                showAddChipsScreen();
                break;
            case 4:
                showCheckoutScreen();
                break;
            case 0:
                cancelOrder();
                break;
        }
    }


    //Methods
    public void showAddSandwichScreen() {
        System.out.println("Adding a Sandwich...");
        // Code for adding sandwich  here
    }

    public void showAddDrinkScreen() {
        System.out.println("Adding a Drink...");
        // Code for adding drink - here
    }

    public void showAddChipsScreen() {
        System.out.println("Adding Chips...");
        // Code for adding chips - here
    }

    public void showCheckoutScreen() {
        System.out.println("Checkout...");
        // Code for checkout + order summary - here
    }

    private void cancelOrder() {
        System.out.println("Order canceled. Returning to home screen.");
        currentOrder = null;
        showHomeScreen();
    }

    // Method to display the title screen with pauses
    public void displayTitleScreen() {
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
        wait(800);
        System.out.println("+██████╗ ███████╗██╗     ██╗               ██████╗██╗ ██████╗ ██╗   ██╗███████╗#");
        wait(300);
        System.out.println("#██╔══██╗██╔════╝██║     ██║              ██╔════╝██║██╔═══██╗██║   ██║██╔════╝+");
        wait(300);
        System.out.println("+██║  ██║█████╗  ██║     ██║    █████╗    ██║     ██║██║   ██║██║   ██║███████╗#");
        wait(350);
        System.out.println("#██║  ██║██╔══╝  ██║     ██║    ╚════╝    ██║     ██║██║   ██║██║   ██║╚════██║+");
        wait(350);
        System.out.println("+██████╔╝███████╗███████╗██║              ╚██████╗██║╚██████╔╝╚██████╔╝███████║#");
        wait(350);
        System.out.println("#╚═════╝ ╚══════╝╚══════╝╚═╝               ╚═════╝╚═╝ ╚═════╝  ╚═════╝ ╚══════╝+");
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
    }

    // Method to handle waiting
    public static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

