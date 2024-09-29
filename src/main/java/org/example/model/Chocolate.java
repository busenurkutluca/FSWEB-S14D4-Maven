package org.example.model;

public class Chocolate extends ProductForSale{

    private double milk;

    public Chocolate(String description, int price, String type, double milk) {
        super(description, price, type);
        this.milk=milk;
    }

    public double getMilk() {
        return milk;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details: ");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Milk: " + getMilk());
    }
}
