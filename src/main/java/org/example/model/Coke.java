package org.example.model;

public class Coke extends ProductForSale {
    private int volumeInMl;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volumeInMl = volumeInMl;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType() + ", Price: $" + getPrice() + ", Description: " + getDescription() +
                ", Volume: " + volumeInMl + " ml");
    }
}