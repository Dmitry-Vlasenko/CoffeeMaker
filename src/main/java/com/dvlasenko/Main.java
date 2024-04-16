package com.dvlasenko;

import com.dvlasenko.controllers.CoffeeMachineController;

public class Main {
    private final CoffeeMachineController startApp = new CoffeeMachineController();

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        startApp.coffeeMachineProcessing();
    }
}