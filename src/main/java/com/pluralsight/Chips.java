package com.pluralsight;

public class Chips extends MenuItem {
    public Chips() {
        basePrice = 1.50;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}
