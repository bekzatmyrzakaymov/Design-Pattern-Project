package com.company.Project.Coffee.ConcreteDecorator;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Decorator.CoffeeDecorator;

public class Marshmallow extends CoffeeDecorator {

    public Marshmallow(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + "\nMarshmallow:300tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }
}
