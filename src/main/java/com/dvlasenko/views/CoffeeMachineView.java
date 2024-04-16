package com.dvlasenko.views;

import com.dvlasenko.models.CoffeeDrink;
import com.dvlasenko.utils.InputValidation;

import java.util.Scanner;

public class CoffeeMachineView {
    private final Scanner scanner;

    public CoffeeMachineView() {
        this.scanner = new Scanner(System.in);
    }

    public void getDrinkChoice() {
        System.out.println("Coffee machine menu:");
        System.out.println("Select a drink:");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Latte");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            while (!this.scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter your choice: ");
                this.scanner.next();
            }
            String choiceStr = this.scanner.nextLine();
            while (!InputValidation.isValid(choiceStr, 3)) {
                System.out.println("Invalid choice. Please try again.");
                choiceStr = this.scanner.nextLine();
            }
            choice = Integer.parseInt(choiceStr);
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1 -> System.out.println("Your " + CoffeeDrink.ESPRESSO.getName() + ". Enjoy :)");
            case 2 -> System.out.println("Your " + CoffeeDrink.LATTE.getName() + ". Enjoy :)");
            case 3 -> System.out.println("Your " + CoffeeDrink.CAPPUCCINO.getName() + ". Enjoy :)");
        }
    }
}
