package com.pluralsight;

import com.pluralsight.ToppingManager.Topping;
import java.util.List;

public class Sandwich extends MenuItem {
    private String bread;
    private String size;
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(String bread, String size, List<Topping> toppings, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
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
        double price = basePrice;

        // Add the cost of each topping to the base price
        for (Topping topping : toppings) {
            price += topping.getCost();
        }

        return price;
    }
}
