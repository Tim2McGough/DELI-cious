package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

// This class handles orders.
    public class Order {
        private List<MenuItem> items;     // Stores the current orders items
        private double totalPrice;     // Stores the  current orders total price based on items ordered.
        private static final double SALES_TAX_RATE = 0.0825; // 8.25% sales tax

        public Order() {
            this.items = new ArrayList<>();
            this.totalPrice = 0.0;
        }

        public void addItem(MenuItem item) {
            items.add(item);
        }

        public void calculateTotalPrice() {
            double subtotal = 0.0;

            // Sum up the prices of each item in items
            for (MenuItem item : items) {
                subtotal += item.calculatePrice();
            }

            // Apply sales tax
            totalPrice = subtotal * (1 + SALES_TAX_RATE);
        }
    }
