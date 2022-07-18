package machine;

public class CoffeeMachineClass {

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

    void buyEspresso() {

        if (countOfWater - espressoNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= espressoNeedWater;

        if (countOfBeans - espressoNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= espressoNeedBeans;

        if (countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += espressoCosts;
    }

    void buyLatte() {

        if (countOfWater - latteNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= latteNeedWater;

        if (countOfMilk - latteNeedMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else countOfMilk -= latteNeedMilk;

        if (countOfBeans - latteNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= latteNeedBeans;

        if (countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += latteCosts;
    }

    void buyCappuccino() {

        if (countOfWater - cappuccinoNeedWater <= 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else countOfWater -= cappuccinoNeedWater;

        if (countOfMilk - cappuccinoNeedMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else countOfMilk -= cappuccinoNeedMilk;

        if (countOfBeans - cappuccinoNeedBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else countOfBeans -= cappuccinoNeedBeans;

        if (countOfDisposableCups - 1 <= 0) {
            System.out.println("Sorry, not enough disposable cups of coffee!");
            return;
        } else countOfDisposableCups--;

        countOfMoney += cappuccinoCosts;
    }

    void printIngredients() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(countOfWater + " ml of water");
        System.out.println(countOfMilk + " ml of milk");
        System.out.println(countOfBeans + " g of coffee beans");
        System.out.println(countOfDisposableCups + " disposable cups");
        System.out.println("$" + countOfMoney + " of money\n");
    }

    void takeMoney() {
        System.out.println("I gave you $" + countOfMoney);
        countOfMoney = 0;
    }

    void addWater(int water) {
        countOfWater += water;
    }

    void addMilk(int milk) {
        countOfMilk += milk;
    }

    public void addBeans(int beans) {
        countOfBeans += beans;
    }

    public void addDisposableCups(int disposableCups) {
        countOfDisposableCups += disposableCups;
    }
}
