package com.dvlasenko.models;

public enum CoffeeDrink {
    ESPRESSO, CAPPUCCINO, LATTE;

    public String getName() {
        return name().toLowerCase();
    }
}
