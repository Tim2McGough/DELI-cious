package com.pluralsight;

public class Drink extends MenuItem {
    public Drink(String size) {
        switch (size) {
            case "Small" -> basePrice = 2.00;
            case "Medium" -> basePrice = 2.50;
            case "Large" -> basePrice = 3.00;
        }
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}
