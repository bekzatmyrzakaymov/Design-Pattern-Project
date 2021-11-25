package com.company.Project.Facade;

import com.company.Project.AbstractFactory.CoffeeStore;
import com.company.Project.AbstractFactory.FactoryPreparedDrinks;
import com.company.Project.AbstractFactory.PreparedByBaristaDrinks;
import com.company.Project.Coffee.Coffee;
import com.company.Project.Observer.CoffeeApplication;
import com.company.Project.Observer.Subscriber;
import com.company.Project.State.ColdState;
import com.company.Project.Strategy.InsideCoffeeShop;
import com.company.Project.Strategy.TakeWithYou;
import com.company.Project.Tea.Component.Barista.BaristaBlackTea;
import com.company.Project.Tea.Component.Barista.BaristaFruitTea;
import com.company.Project.Tea.Component.Barista.BaristaGreenTea;
import com.company.Project.Tea.Component.Fabric.FabricBlackTea;
import com.company.Project.Tea.Component.Fabric.FabricFruitTea;
import com.company.Project.Tea.Component.Fabric.FabricGreenTea;
import com.company.Project.Tea.Tea;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrderFacadeImpl implements OrderFacade {

    public static void type() {
        for (String s : Arrays.asList("Choose drink type:",
                "1. Barista",
                "2. Fabric")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");
    }

    public static void fabricCoffee() {
        System.out.println("Your coffee will be taken from cupboard.");
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("Please choose Fabric coffee type:",
                "1. Fabric Americano - 600 tg",
                "2. Fabric Cappuccino - 600 tg",
                "3. Fabric Espresso - 700 tg",
                "4. Fabric Latte - 550 tg")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");
    }

    public static void baristaCoffee() {
        System.out.println("Your coffee will be prepared by our Barista.");
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("Please choose Barista coffee type: ",
                "1. Barista Americano - 600 tg",
                "2. Barista Cappuccino - 600 tg",
                "3. Barista Espresso - 700 tg",
                "4. Barista Latte - 550 tg")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");
    }

    public static void fabricTea() {
        System.out.println("Your tea will be taken from cupboard.");
        System.out.println("__________________________________________");
        List<String> asList = Arrays.asList("Please choose Fabric tea type: ",
                "1. Fabric Black Tea - 300 tg",
                "2. Fabric Fruit Tea - 600 tg",
                "3. Fabric Green Tea - 400 tg");
        for (String s : asList) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");
    }

    public static void baristaTea() {
        System.out.println("Your tea will be prepared by our Barista.");
        System.out.println("__________________________________________");
        List<String> asList = Arrays.asList("Please choose Barista tea type: ",
                "1. Barista Black Tea - 300 tg",
                "2. Barista Fruit Tea - 600 tg",
                "3. Barista Green Tea - 400 tg");
        for (String s : asList) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");
    }

    public static void totalCostTea(Tea tea) {
        System.out.println(tea.description());
        System.out.println(tea.cost());
    }

    public static void totalCostCoffee(Coffee coffee) {
        System.out.println(coffee.description());
        System.out.println(coffee.cost());
    }

    public static void addToTea(Tea tea, CoffeeStore coffeeStore) {
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("What do you want to add to Tea?",
                "1. Milk", "2. Sugar",
                "3. Cinnamon", "4. Dried Berries",
                "5. No need / Stop adding")) {
            System.out.println(s);
        }

        System.out.print("Please enter the number:");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("__________________________________________");

        switch (n){

            case 1:
                System.out.println("Adding milk to your tea...");
                tea = coffeeStore.addMilkToTea(tea);
                addToTea(tea,coffeeStore);
                break;

            case 2:
                System.out.println("Adding sugar to your tea...");
                tea = coffeeStore.addSugarToTea(tea);
                addToTea(tea,coffeeStore);
                break;

            case 3:
                System.out.println("Adding cinnamon to your tea...");
                tea = coffeeStore.addCinnamonToTea(tea);
                addToTea(tea,coffeeStore);
                break;

            case 4:
                System.out.println("Adding Dried Berries to your tea...");
                tea = coffeeStore.addDriedBerriesToTea(tea);
                addToTea(tea,coffeeStore);
                break;

            case 5:
                totalCostTea(tea);
                stateCoffee(coffeeStore);
                takeCoffee(coffeeStore);
                break;

            default:
                System.out.println("Number not found. Please try again.");
                addToTea(tea,coffeeStore);
                break;
        }
    }

    public static void coffeeAdd(Coffee coffee, CoffeeStore coffeeStore) {
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("What do you want to add to coffee? ",
                "1. Caramel Syrup", "2. Walnut Syrup", "3. Milk",
                "4. Sugar", "5. Marshmallow", "6. No need / Stop adding")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        Scanner scan = new Scanner(System.in);
        int adding = scan.nextInt();
        System.out.println("__________________________________________");

        switch (adding){

            case 1:
                System.out.println("Adding caramel syrup to your coffee...");
                coffee = coffeeStore.addCaramelSyrupToCoffee(coffee);
                coffeeAdd(coffee,coffeeStore);
                break;

            case 2:
                System.out.println("Adding walnut syrup to your coffee...");
                coffee = coffeeStore.addWalnutSyrupToCoffee(coffee);
                coffeeAdd(coffee,coffeeStore);
                break;

            case 3:
                System.out.println("Adding milk to your coffee...");
                coffee = coffeeStore.addMilkToCoffee(coffee);
                coffeeAdd(coffee,coffeeStore);
                break;

            case 4:
                System.out.println("Adding sugar to your coffee...");
                coffee = coffeeStore.addSugarToCoffee(coffee);
                coffeeAdd(coffee,coffeeStore);
                break;

            case 5:
                System.out.println("Adding marshmallow to your coffee...");
                coffee = coffeeStore.addMarshmallowToCoffee(coffee);
                coffeeAdd(coffee,coffeeStore);
                break;

            case 6:
                totalCostCoffee(coffee);
                stateCoffee(coffeeStore);
                takeCoffee(coffeeStore);
                break;

            default:
                System.out.println("Number not found. Please try again.");
                coffeeAdd(coffee,coffeeStore);
                break;
        }
    }

    public static void fabricCoffeeAdd(Coffee fabricCoffee, CoffeeStore coffeeStore1) {
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("What do you want to add to coffee? ",
                "1. Milk", "2. Sugar", "3. Marshmallow",
                "4. Nothing/Stop adding")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        Scanner scan = new Scanner(System.in);
        int addingToFabricCoffee = scan.nextInt();
        System.out.println("__________________________________________");

        switch (addingToFabricCoffee){

            case 1:
                System.out.println("Adding milk to your fabric coffee...");
                fabricCoffee = coffeeStore1.addMilkToCoffee(fabricCoffee);
                fabricCoffeeAdd(fabricCoffee, coffeeStore1);
                break;

            case 2:
                System.out.println("Adding sugar to your fabric coffee...");
                fabricCoffee = coffeeStore1.addSugarToCoffee(fabricCoffee);
                fabricCoffeeAdd(fabricCoffee, coffeeStore1);
                break;

            case 3:
                System.out.println("Adding marshmallow to your fabric coffee...");
                fabricCoffee = coffeeStore1.addMarshmallowToCoffee(fabricCoffee);
                fabricCoffeeAdd(fabricCoffee, coffeeStore1);
                break;

            case 4:
                totalCostCoffee(fabricCoffee);
                stateCoffee(coffeeStore1);
                takeCoffee(coffeeStore1);
                break;

            default:
                System.out.println("Number not found. Please try again.");
                fabricCoffeeAdd(fabricCoffee, coffeeStore1);
                break;
        }
    }

    public static void moreCoffee() {
        System.out.println("__________________________________________");
        System.out.println("Do you want to take more drinks? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please enter the number:");

        Scanner scann = new Scanner(System.in);
        int newone = scann.nextInt();
        System.out.println("__________________________________________");

        switch (newone){

            case 1:
                for (String s : Arrays.asList("Welcome to the Coffee store 'Espressimo'",
                        "What do you want to choose?",
                        "1. Tea",
                        "2. Coffee")) {
                    System.out.println(s);
                }
                System.out.print("Please enter the number:");
                implementation();
                break;

            case 2:
                subscription();
                break;

            default:
                System.out.println("Number not found. Please try again.");
                moreCoffee();
                break;
        }
    }

    public static void discounts() {
        System.out.println("__________________________________________");
        System.out.println("Do you want to check news?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please enter the number:");
    }

    public static void subscription() {
        for (String s : Arrays.asList("Do you want to follow our news?", "1. Yes", "2. No")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        CoffeeApplication Espressimo = new CoffeeApplication();
        Espressimo.addDiscount("Every friday 10% discount for all visitors.");

        Scanner scann = new Scanner(System.in);
        int register = scann.nextInt();
        System.out.println("__________________________________________");

        switch(register){

            case 1:
                System.out.println("Please enter your name:");
                Scanner scanne = new Scanner(System.in);
                String namee = scanne.nextLine();

                Subscriber subscriber = new Subscriber(Espressimo, namee);
                System.out.println("__________________________________________");
                System.out.println("You are able to see discounts.");
                discounts();

                Scanner scannering = new Scanner(System.in);
                int numb = scannering.nextInt();
                System.out.println("__________________________________________");

                switch (numb){

                    case 1:
                        Espressimo.addDiscount("New Year discount: 2+1 coffee.");
                        subscriber.update();
                        System.out.println("Good bye! Have a nice day!");
                        break;

                    case 2 :
                        System.out.println("Good bye! Have a nice day!");
                        break;

                    default:
                        System.out.println("Number not found. Please try again.");
                        subscription();
                        break;
                }
                break;

            case 2:
                System.out.println("Good bye! Have a nice day!");
                break;

            default:
                System.out.println("Number not found. Please try again.");
                subscription();
                break;
        }
    }

    public static void takeCoffee(CoffeeStore coffeeStore) {
        System.out.println("__________________________________________");
        for (String s : Arrays.asList("Where would you like to drink? :", "1. Take coffee by yourself",
                "2. Take coffee in the Coffee shop")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("__________________________________________");

        switch (num){

            case 1:
                TakeWithYou takeWithYou = new TakeWithYou();
                coffeeStore.takeCoffee(takeWithYou);
                moreCoffee();
                break;

            case 2:
                InsideCoffeeShop insideCoffeeShop = new InsideCoffeeShop();
                coffeeStore.takeCoffee(insideCoffeeShop);
                moreCoffee();
                break;

            default:
                System.out.println("Number not found. Please try again.");
                takeCoffee(coffeeStore);
                break;
        }
    }

    public static void stateCoffee(CoffeeStore coffeeStore) {
        System.out.println("__________________________________________");

        for (String s : Arrays.asList("Please choose the state of your drink:", "1. Hot", "2. Cold")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("__________________________________________");
        switch (num){

            case 1:
                coffeeStore.getState();
                break;

            case 2:
                coffeeStore.setState(new ColdState());
                coffeeStore.getState();
                break;

            default:
                System.out.println("Number not found. Please try again.");
                stateCoffee(coffeeStore);
                break;
        }
    }

    public static void implementation() {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("__________________________________________");

        switch (num){

            case 1:
                System.out.println("Your choice is tea");
                System.out.println("__________________________________________");
                type();
                int typeTea = scan.nextInt();
                System.out.println("__________________________________________");

                switch (typeTea){

                    case 1:
                        System.out.println("Your choice is Barista type");
                        System.out.println("__________________________________________");
                        baristaTea();
                        int barista = scan.nextInt();
                        CoffeeStore coffeeStore = new PreparedByBaristaDrinks();
                        switch (barista){
                            case 1:
                                Tea tea = coffeeStore.createTea(new BaristaBlackTea());
                                System.out.println("__________________________________________");
                                System.out.println(tea.description());
                                addToTea(tea,coffeeStore);
                                break;

                            case 2:
                                Tea fruitTea = coffeeStore.createTea(new BaristaFruitTea());
                                System.out.println("__________________________________________");
                                System.out.println(fruitTea.description());
                                addToTea(fruitTea,coffeeStore);
                                break;

                            case 3:
                                Tea greenTea = coffeeStore.createTea(new BaristaGreenTea());
                                System.out.println("__________________________________________");
                                System.out.println(greenTea.description());
                                addToTea(greenTea,coffeeStore);
                                break;

                            default:
                                System.out.println("Number not found. Please try again.");
                                implementation();
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Your choice is Fabric Type");
                        System.out.println("__________________________________________");
                        fabricTea();
                        int fabricTea = scan.nextInt();
                        CoffeeStore coffeeStore1 = new FactoryPreparedDrinks();

                        switch (fabricTea){

                            case 1:
                                Tea tea = coffeeStore1.createTea(new FabricBlackTea());
                                System.out.println("__________________________________________");
                                System.out.println(tea.description());
                                addToTea(tea,coffeeStore1);
                                break;

                            case 2:
                                Tea fruitTea = coffeeStore1.createTea(new FabricFruitTea());
                                System.out.println("__________________________________________");
                                System.out.println(fruitTea.description());
                                addToTea(fruitTea,coffeeStore1);
                                break;

                            case 3:
                                Tea greenTea = coffeeStore1.createTea(new FabricGreenTea());
                                System.out.println("__________________________________________");
                                System.out.println(greenTea.description());
                                addToTea(greenTea,coffeeStore1);
                                break;

                            default:
                                System.out.println("Number not found. Please try again.");
                                implementation();
                                break;
                        }
                        break;

                    default:
                        System.out.println("Number not found");
                }
                break;

            case 2:

                System.out.println("Your choice is coffee");
                System.out.println("__________________________________________");

                type();
                int typeCoffee = scan.nextInt();
                System.out.println("__________________________________________");

                switch (typeCoffee){

                    case 1:
                        System.out.println("Your choice is Barista type");
                        System.out.println("__________________________________________");

                        baristaCoffee();
                        int barista = scan.nextInt();
                        CoffeeStore coffeeStore = new PreparedByBaristaDrinks();

                        switch (barista){

                            case 1:
                                Coffee coffee = coffeeStore.createCoffee("Americano");
                                System.out.println("__________________________________________");
                                System.out.println(coffee.description());

                                coffeeAdd(coffee, coffeeStore);
                                break;

                            case 2:
                                Coffee coffee1 = coffeeStore.createCoffee("Cappuccino");
                                System.out.println("__________________________________________");
                                System.out.println(coffee1.description());

                                coffeeAdd(coffee1, coffeeStore);
                                break;

                            case 3:
                                Coffee espresso = coffeeStore.createCoffee("Espresso");
                                System.out.println("__________________________________________");
                                System.out.println(espresso.description());

                                coffeeAdd(espresso, coffeeStore);
                                break;

                            case 4:
                                Coffee latte = coffeeStore.createCoffee("Latte");
                                System.out.println("__________________________________________");
                                System.out.println(latte.description());

                                coffeeAdd(latte, coffeeStore);
                                break;

                            default:
                                System.out.println("Number not found. Please try again.");
                                implementation();
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Your choice Fabric Type");
                        System.out.println("__________________________________________");

                        fabricCoffee();
                        int fabricCoffee = scan.nextInt();
                        CoffeeStore coffeeStore1 = new FactoryPreparedDrinks();

                        switch (fabricCoffee){

                            case 1:
                                Coffee coffee = coffeeStore1.createCoffee("Americano");
                                System.out.println("__________________________________________");
                                System.out.println(coffee.description());

                                fabricCoffeeAdd(coffee, coffeeStore1);
                                break;

                            case 2:
                                Coffee coffee1 = coffeeStore1.createCoffee("Cappuccino");
                                System.out.println("__________________________________________");
                                System.out.println(coffee1.description());

                                fabricCoffeeAdd(coffee1, coffeeStore1);
                                break;

                            case 3:
                                Coffee espresso = coffeeStore1.createCoffee("Espresso");
                                System.out.println("__________________________________________");
                                System.out.println(espresso.description());

                                fabricCoffeeAdd(espresso, coffeeStore1);
                                break;

                            case 4:
                                Coffee latte = coffeeStore1.createCoffee("Latte");
                                System.out.println("__________________________________________");
                                System.out.println(latte.description());

                                fabricCoffeeAdd(latte, coffeeStore1);
                                break;

                            default:
                                System.out.println("Number not found. Please try again.");
                                implementation();
                                break;
                        }
                        break;
                    default:
                        System.out.println("Number not found. Please try again.");
                        implementation();
                        break;
                }

                break;
            default:
                System.out.println("Number not found. Please try again.");
                implementation();
                break;
        }
    }

    @Override
    public void order() {
        for (String s : Arrays.asList("Welcome to the Coffee store 'Espressimo'",
                "What do you want to choose?",
                "1. Tea",
                "2. Coffee")) {
            System.out.println(s);
        }
        System.out.print("Please enter the number:");

        implementation();
    }
}
