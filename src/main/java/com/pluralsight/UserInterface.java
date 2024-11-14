package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Order currentOrder = new Order();
    private Scanner scanner = new Scanner(System.in);

    // Home screen to start a new order or exit
    public void showHomeScreen() {
        while (true) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showAddSandwichScreen();
                case 2 -> addDrink();
                case 3 -> addChips();
                case 4 -> checkout();
                case 0 -> exit();
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private void showAddSandwichScreen() {
        System.out.println("Creating a new sandwich...");

        // Select bread type and size
        String size = selectSandwichSize();
        String bread = selectBreadType();

        // Select toppings
        System.out.println("Select toppings:");
        var chosenToppings = ToppingManager.selectToppings();

        // Toast option
        System.out.println("Would you like the sandwich toasted? (yes/no)");
        boolean isToasted = scanner.next().equalsIgnoreCase("yes");

        // Create and add the sandwich to the order
        Sandwich sandwich = new Sandwich(bread, size, chosenToppings, isToasted);
        currentOrder.addItem(sandwich);

        System.out.println("Sandwich added to order.");
    }

    private void addDrink() {
        System.out.println("Select drink size:");
        System.out.println("1) Small ($2.00)");
        System.out.println("2) Medium ($2.50)");
        System.out.println("3) Large ($3.00)");
        int sizeChoice = scanner.nextInt();

        Drink drink = switch (sizeChoice) {
            case 1 -> new Drink("Small");
            case 2 -> new Drink("Medium");
            case 3 -> new Drink("Large");
            default -> null;
        };

        if (drink != null) {
            currentOrder.addItem(drink);
            System.out.println("Drink added to order.");
        } else {
            System.out.println("Invalid size selection. Returning to main menu.");
        }
    }

    private void addChips() {
        Chips chips = new Chips();
        currentOrder.addItem(chips);
        System.out.println("Chips added to order.");
    }

    private void checkout() {
        currentOrder.calculateTotalPrice();
        System.out.printf("Total (including tax): $%.2f\n", currentOrder.getTotalPrice());
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.generateReceipt(currentOrder);
    }

    private void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    private String selectSandwichSize() {
        while (true) {
            System.out.println("Select sandwich size:");
            System.out.println("1) 4\" ($5.50)");
            System.out.println("2) 8\" ($7.00)");
            System.out.println("3) 12\" ($8.50)");
            int choice = scanner.nextInt();
            return switch (choice) {
                case 1 -> "4\"";
                case 2 -> "8\"";
                case 3 -> "12\"";
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    yield null;
                }
            };
        }
    }

    private String selectBreadType() {
        while (true) {
            System.out.println("Select bread type:");
            System.out.println("1) White");
            System.out.println("2) Wheat");
            System.out.println("3) Rye");
            System.out.println("4) Wrap");
            int choice = scanner.nextInt();
            return switch (choice) {
                case 1 -> "White";
                case 2 -> "Wheat";
                case 3 -> "Rye";
                case 4 -> "Wrap";
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    yield null;
                }
            };
        }
    }


    // Method to display the title screen with pauses
    public void displayTitleScreen() {
        System.out.println("Welcome to ...");
        wait(900);
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

