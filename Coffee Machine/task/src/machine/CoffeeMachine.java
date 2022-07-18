package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int countOfWater = 400;
    private static int countOfMilk = 540;
    private static int countOfBeans = 120;
    private static int countOfDisposableCups = 9;
    private static int countOfMoney = 550;
    //private static int countOfCupsWanted = 0;
    private static final int espressoNeedWater = 250;
    //private static final int espressoNeedMilk = 0;
    private static final int espressoNeedBeans = 16;
    private static final int espressoCosts = 4;

    private static final int latteNeedWater = 350;
    private static final int latteNeedMilk = 75;
    private static final int latteNeedBeans = 20;
    private static final int latteCosts = 7;

    private static final int cappuccinoNeedWater = 200;
    private static final int cappuccinoNeedMilk = 100;
    private static final int cappuccinoNeedBeans = 12;
    private static final int cappuccinoCosts = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "exit":
                    stop = true;
                    break;
                case "remaining":
                    printIngredients();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (scanner.next()) {
                        case "1":
                            buyEspresso();
                            break;
                        case "2":
                            buyLatte();
                            break;
                        case "3":
                            buyCappuccino();
                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    countOfWater += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    countOfMilk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    countOfBeans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    countOfDisposableCups += scanner.nextInt();
                    break;
                case "take":
                    countOfMoney = 0;
                    break;
                default:
                    break;
            }

        }

    }

    private static void buyEspresso() {

        if(countOfWater - espressoNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= espressoNeedWater;

        if(countOfBeans - espressoNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= espressoNeedBeans;

        if(countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += espressoCosts;
    }

    private static void buyLatte() {

        if(countOfWater - latteNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= latteNeedWater;

        if(countOfMilk - latteNeedMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else countOfMilk -= latteNeedMilk;

        if(countOfBeans - latteNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= latteNeedBeans;

        if(countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += latteCosts;
    }

    private static void buyCappuccino() {

        if(countOfWater - cappuccinoNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= cappuccinoNeedWater;

        if(countOfMilk - cappuccinoNeedMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else countOfMilk -= cappuccinoNeedMilk;

        if(countOfBeans - cappuccinoNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= cappuccinoNeedBeans;

        if(countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += cappuccinoCosts;
    }

    private static void printIngredients() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(countOfWater + " ml of water");
        System.out.println(countOfMilk + " ml of milk");
        System.out.println(countOfBeans + " g of coffee beans");
        System.out.println(countOfDisposableCups + " disposable cups");
        System.out.println("$" + countOfMoney + " of money\n");
    }

    /*private static void printFeaturesOfTheCoffeeMachine() {
        int canDoCupsWithWater = countOfWater / needWater;
        int canDoCupsWithMilk = countOfMilk / needMilk;
        int canDoCupsWithBeans = countOfBeans / needBeans;
        int smallest = Math.min(canDoCupsWithWater, Math.min(canDoCupsWithMilk, canDoCupsWithBeans));

        if (smallest == countOfCupsWanted) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (smallest > countOfCupsWanted) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (smallest - countOfCupsWanted) + " more than that)");
        } else {
            System.out.println("No, I can make only " + smallest + " cup(s) of coffee");
        }
    }*/
}
