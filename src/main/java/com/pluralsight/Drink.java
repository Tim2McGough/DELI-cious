package com.pluralsight;

public class Drink extends MenuItem {
    private String size;

    public Drink(String size) {
        this.size = size;
        switch (size) {
            case "Small":
                this.basePrice = 2.00;
                break;
            case "Medium":
                this.basePrice = 2.50;
                break;
            case "Large":
                this.basePrice = 3.00;
                break;
        }
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}
