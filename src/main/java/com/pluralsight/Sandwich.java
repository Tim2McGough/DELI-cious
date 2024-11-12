package com.pluralsight;

import java.util.List;

public class Sandwich extends MenuItem {
    private String bread;
    private String size;
    private List<String> toppings;
    private List<PremiumTopping> premiumToppings;
    private boolean isToasted;
// Constructor
    public Sandwich(String bread, String size, List<String> toppings, List<PremiumTopping> premiumToppings, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.premiumToppings = premiumToppings;
        this.isToasted = isToasted;

        // Set basePrice based on sandwich size
        switch (size) {
            case "4\"":
                this.basePrice = 5.50;
                break;
            case "8\"":
                this.basePrice = 7.00;
                break;
            case "12\"":
                this.basePrice = 8.50;
                break;
        }
    }

    @Override
    public double calculatePrice() {
        double price = basePrice; // Start with the base price

        // Add the cost of each premium topping
        for (PremiumTopping topping : premiumToppings) {
            price += topping.getCost();
        }

        return price;
    }

}

