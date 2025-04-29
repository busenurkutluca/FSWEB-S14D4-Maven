package org.example.model;

public class Bread extends ProductForSale {
    private int weightInGrams;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weightInGrams = weightInGrams;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType() + ", Price: $" + getPrice() + ", Description: " + getDescription() +
                ", Weight: " + weightInGrams + " grams");
    }
}