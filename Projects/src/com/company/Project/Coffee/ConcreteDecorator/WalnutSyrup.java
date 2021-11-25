package com.company.Project.Coffee.ConcreteDecorator;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Decorator.CoffeeDecorator;

public class WalnutSyrup extends CoffeeDecorator {

    public WalnutSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + "\nWalnutSyrup:150tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 150;
    }
}
