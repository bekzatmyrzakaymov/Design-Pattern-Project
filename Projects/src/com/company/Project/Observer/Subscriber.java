package com.company.Project.Observer;

public class Subscriber implements Observer {

    private final String first_name;

    private final CoffeeApplication coffeeApplication;


    public Subscriber(CoffeeApplication coffeeApplication, String first_name) {
        this.first_name = first_name;
        this.coffeeApplication = coffeeApplication;

    }

    @Override
    public void update() {
        System.out.println("Hello, " + this.first_name + "! " + "\n" +"Our discounts: " + "\n" + coffeeApplication.getDiscounts());
        System.out.println("__________________________________________________");
    }

}
