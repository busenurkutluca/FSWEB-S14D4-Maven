package org.example;

import org.example.model.*;
import org.example.rpg.Troll;

public class Main {
    public static void main(String[] args) {
        // Product For Sale Testleri
        System.out.println("=== Product For Sale Testleri ===");
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark Chocolate", 2.5, "Rich dark chocolate bar");
        products[1] = new Coke("Cola", 1.5, "Refreshing cola drink");
        products[2] = new Bread("Whole Wheat Bread", 3.0, "Freshly baked whole wheat bread");

        Store.listProducts(products);
        System.out.println();

        // Monster For Simple RPG Game Testleri
        System.out.println("=== Monster For Simple RPG Game Testleri ===");
        Troll troll = new Troll("Forest Troll", 100, 20.0);
        System.out.println("Monster: " + troll.getName());
        System.out.println("Hit Points: " + troll.getHitPoints());
        System.out.println("Base Damage: " + troll.getDamage());
        System.out.println("Bleed Damage: " + troll.bleed());
        System.out.println("Poison Damage: " + troll.poison());
        System.out.println("Total Attack Damage: " + troll.attack());
    }
}