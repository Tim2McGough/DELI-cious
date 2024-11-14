package com.pluralsight;


// it's what a chip is. That's it!
public class Chips extends MenuItem {
    public Chips() {
        basePrice = 1.50;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}
