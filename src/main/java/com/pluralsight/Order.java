package com.pluralsight;

public class Order {
    private List<MenuItem> items;
    private double totalPrice;

    public Order(List<MenuItem> items, double totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }
}
