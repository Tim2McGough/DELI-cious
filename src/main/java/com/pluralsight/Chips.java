package com.pluralsight;

public class Chips extends MenuItem {
    public Chips() {
        this.basePrice = 1.50;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}
