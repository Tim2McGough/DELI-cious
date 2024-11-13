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
        System.out.println("Creating a new sandwich...");

        // Prompt for sandwich size
        System.out.println("Select sandwich size:");
        System.out.println("1) 4\" ($5.50)");
        System.out.println("2) 8\" ($7.00)");
        System.out.println("3) 12\" ($8.50)");
        int sizeChoice = scanner.nextInt();
        String size = switch (sizeChoice) {
            case 1 -> "4\"";
            case 2 -> "8\"";
            case 3 -> "12\"";
            default -> "8\""; // Default to 8" if input is invalid
        };

        // Prompt for bread type
        System.out.println("Select bread type:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        int breadChoice = scanner.nextInt();
        String bread = switch (breadChoice) {
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> "White"; // Default to White if input is invalid
        };

        System.out.println("You chose a " + size + " sandwich on " + bread + " bread.");

        // Placeholder for next step: choosing toppings
        System.out.println("Next, you will select your toppings.");
    }
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

