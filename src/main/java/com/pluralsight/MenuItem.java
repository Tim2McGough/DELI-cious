package com.pluralsight;

// each item will need its own base price and can extend to this class for that.
public abstract class MenuItem {
    protected double basePrice;

    public abstract double calculatePrice();
}
