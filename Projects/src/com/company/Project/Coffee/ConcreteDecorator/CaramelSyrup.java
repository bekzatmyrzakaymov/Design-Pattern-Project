package com.company.Project.Coffee.ConcreteDecorator;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Decorator.CoffeeDecorator;

public class CaramelSyrup extends CoffeeDecorator {

    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + "\nCaramelSyrup:150tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 150;
    }
}
