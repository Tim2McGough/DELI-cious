package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // Holds the users order in list called items
    private List<MenuItem> items = new ArrayList<>();
    // set default price to 0
    private double totalPrice = 0.0;
    // State of texas sales tax + standard city tax
    private static final double SALES_TAX_RATE = 0.0825;
// method for adding an item
    public void addItem(MenuItem item) {
        items.add(item);
    }
// does as it does. Calculate the price
    public void calculateTotalPrice() {
        double subtotal = items.stream().mapToDouble(MenuItem::calculatePrice).sum();
        totalPrice = subtotal * (1 + SALES_TAX_RATE);
    }
// Ability to return the total price we calculated on ln 18
    public double getTotalPrice() {
        return totalPrice;
    }
}
