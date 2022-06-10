package Machine;

import Drinks.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseDrinkLogic {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void orderCoffee() throws IOException {
        System.out.println("Hello! Welcome to our first DrinkShop.");
        System.out.println("              Our MENU:               ");
        System.out.println("       1. Americano     1.2$          ");
        System.out.println("       2. Cappuccino    1.2$          ");
        System.out.println("       3. Latte         1.2$          ");
        System.out.println("       4. Tea           1.2$          ");
        System.out.println("Enter number from 1 to 4 to select a drink");
        System.out.println("Enter 0 if you have completed the selection");
        Drinks[] drinks = new Drinks[5];
        fillDrinks(drinks);
        int a =0;
        while (true) {
            int coffeeType = Integer.parseInt(READER.readLine());
            switch (coffeeType) {
                case 1 -> {drinks[a] = new Americano();a++;}
                case 2 -> {drinks[a] = new Cappuccino();a++;}
                case 3 -> {drinks[a] = new Latte();a++;}
                case 4 -> {drinks[a] = new Tea();a++;}
                case 0 -> {ChooseDrinkLogic.totalCost(drinks);}
                default -> System.out.println("Incorrect input");
            }
        }
    }
    private static void fillDrinks(Drinks[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = new Drinks();
        }
    }
    private static void totalCost(Drinks[] drinks) {
        double money = 0;
        for (Drinks coffee : drinks) {
            if (coffee.getClass() == Latte.class) {
                money += Latte.price();
            } else if (coffee.getClass() == Cappuccino.class) {
                money += Cappuccino.price();
            } else if (coffee.getClass() == Americano.class) {
                money += Americano.price();
            } else if (coffee.getClass() == Tea.class) {
                money += Tea.price();
            }
        }
        System.out.println("You have to pay " + money + "$");
    }
}
