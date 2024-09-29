package org.example.rpg;

public abstract class Monster {
   private String name;
   private int hitPoints;
   private double damage;

    public Monster(double damage, int hitPoints, String name) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public abstract double attack();

}
