package com.pluralsight;

import java.util.List;

public class Sandwich extends MenuItem {
    private String bread;
    private String size;
    private List<ToppingManager.Topping> toppings;
    private boolean isToasted;

    public Sandwich(String bread, String size, List<ToppingManager.Topping> toppings, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
        switch (size) {
            case "4\"" -> this.basePrice = 5.50;
            case "8\"" -> this.basePrice = 7.00;
            case "12\"" -> this.basePrice = 8.50;
        }
    }

    @Override
    public double calculatePrice() {
        return basePrice + toppings.stream().mapToDouble(ToppingManager.Topping::getCost).sum();
    }
}
