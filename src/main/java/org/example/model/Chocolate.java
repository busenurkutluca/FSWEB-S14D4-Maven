package org.example.model;

public class Chocolate extends ProductForSale {
    private double weightInGrams;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.weightInGrams = weightInGrams;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType() + ", Price: $" + getPrice() + ", Description: " + getDescription() +
                ", Weight: " + weightInGrams + " grams");
    }
}