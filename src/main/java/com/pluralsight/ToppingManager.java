package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToppingManager {

    // All toppings (regular and premium together)
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

    // Method to get all toppings
    public static List<Topping> getToppings() {
        return TOPPINGS;
    }

    // Method to filter regular toppings (if needed)
    public static List<Topping> getRegularToppings() {
        return TOPPINGS.stream()
                .filter(topping -> topping.getCost() == 0.0)
                .collect(Collectors.toList());
    }

    // Method to filter premium toppings (if needed)
    public static List<Topping> getPremiumToppings() {
        return TOPPINGS.stream()
                .filter(topping -> topping.getCost() > 0.0)
                .collect(Collectors.toList());
    }

    // Inner Topping class to represent each topping (name + cost)
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
