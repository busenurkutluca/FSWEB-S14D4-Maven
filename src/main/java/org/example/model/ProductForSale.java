package org.example.model;

public abstract class ProductForSale {
    private String type;
    private  int price;
    private String description;

    public ProductForSale(String description, int price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }


    public int getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();
}
