package com.dvlasenko.controllers;


import com.dvlasenko.views.CoffeeMachineView;

public class CoffeeMachineController {
    public void coffeeMachineProcessing() {
        CoffeeMachineView coffeeMachineView = new CoffeeMachineView();
        coffeeMachineView.getDrinkChoice();
    }
}
