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
        printIngredients();

        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.next();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                switch (scanner.nextInt()) {
                    case 1:
                        countOfWater -= espressoNeedWater;
                        countOfBeans -= espressoNeedBeans;
                        countOfMoney += espressoCosts;
                        countOfDisposableCups--;
                        break;
                    case 2:
                        countOfWater -= latteNeedWater;
                        countOfMilk -= latteNeedMilk;
                        countOfBeans -= latteNeedBeans;
                        countOfMoney += latteCosts;
                        countOfDisposableCups--;
                        break;
                    case 3:
                        countOfWater -= cappuccinoNeedWater;
                        countOfMilk -= cappuccinoNeedMilk;
                        countOfBeans -= cappuccinoNeedBeans;
                        countOfMoney += cappuccinoCosts;
                        countOfDisposableCups--;
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
        printIngredients();


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
