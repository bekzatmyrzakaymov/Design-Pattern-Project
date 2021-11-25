package com.company.Project.Coffee.Decorator;

import com.company.Project.Coffee.Coffee;

public class CoffeeDecorator implements Coffee {

    Coffee coffee;
    public CoffeeDecorator( Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
