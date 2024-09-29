package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 3, "Dark chocolate with 70% cocoa", 70.0);
        products[1] = new Coke("Coke", 1, "Refreshing beverage", true);
        products[2] = new Bread("Bread", 2, "Whole grain bread", "Whole Grain");

        Store store = new Store();
        store.listProducts(products);
    }
}