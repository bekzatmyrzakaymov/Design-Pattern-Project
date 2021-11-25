package com.company.Project.Coffee.ConcreteDecorator;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Decorator.CoffeeDecorator;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + "\nMilk:250tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 250;
    }
}
