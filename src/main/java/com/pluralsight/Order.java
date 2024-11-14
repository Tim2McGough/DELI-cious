package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();
    private double totalPrice = 0.0;
    private static final double SALES_TAX_RATE = 0.0825;

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void calculateTotalPrice() {
        double subtotal = items.stream().mapToDouble(MenuItem::calculatePrice).sum();
        totalPrice = subtotal * (1 + SALES_TAX_RATE);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
