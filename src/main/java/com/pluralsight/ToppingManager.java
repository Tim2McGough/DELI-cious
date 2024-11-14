package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToppingManager {
    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Topping> TOPPINGS = Arrays.asList(
            new Topping("Lettuce", 0.0),
            new Topping("Tomato", 0.0),
            new Topping("Onions", 0.0),
            new Topping("Peppers", 0.0),
            new Topping("Pickles", 0.0),
            new Topping("Cucumbers", 0.0),
            new Topping("Jalapeños", 0.0),
            new Topping("Bacon", 1.50),
            new Topping("Cheese", 0.75),
            new Topping("Avocado", 1.25)
    );

    public static List<Topping> selectToppings() {
        List<Topping> selectedToppings = new ArrayList<>();
        for (int i = 0; i < TOPPINGS.size(); i++) {
            System.out.println((i + 1) + ") " + TOPPINGS.get(i).getName() +
                    (TOPPINGS.get(i).getCost() > 0 ? " (Additional $" + TOPPINGS.get(i).getCost() + ")" : ""));
        }
        System.out.println("0) No more toppings");

        int choice;
        while ((choice = scanner.nextInt()) != 0) {
            if (choice > 0 && choice <= TOPPINGS.size()) {
                selectedToppings.add(TOPPINGS.get(choice - 1));
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        return selectedToppings;
    }

    public static class Topping {
        private final String name;
        private final double cost;

        public Topping(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }
    }
}
