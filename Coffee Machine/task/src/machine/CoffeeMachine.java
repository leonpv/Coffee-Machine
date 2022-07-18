package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        CoffeeMachineClass coffeeMachine = new CoffeeMachineClass();

        while (!stop) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (scanner.next()) {
                        case "1":
                            coffeeMachine.buyEspresso();
                            break;
                        case "2":
                            coffeeMachine.buyLatte();
                            break;
                        case "3":
                            coffeeMachine.buyCappuccino();
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Unsupportable command! Try again.");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    coffeeMachine.addWater(scanner.nextInt());
                    System.out.println("Write how many ml of milk you want to add: ");
                    coffeeMachine.addMilk(scanner.nextInt());
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffeeMachine.addBeans(scanner.nextInt());
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    coffeeMachine.addDisposableCups(scanner.nextInt());
                    break;
                case "take":
                    coffeeMachine.takeMoney();
                    break;

                case "remaining":
                    coffeeMachine.printIngredients();
                    break;
                case "exit":
                    stop = true;
                    break;
                default:
                    break;
            }

        }

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
