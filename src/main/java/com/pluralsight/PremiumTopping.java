package com.pluralsight;

public class PremiumTopping {
    private String name;
    private double cost;

    // Constructor
    public PremiumTopping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // Getter for cost
    public double getCost() {
        return cost;
    }

    /* (Optional) Getter for name, if needed for display purposes  TIM DELETE THIS IF NOT USED.@@@@
    public String getName() {
        return name; */
    }
