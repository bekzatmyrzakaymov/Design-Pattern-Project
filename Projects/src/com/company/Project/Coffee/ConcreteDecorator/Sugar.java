package com.company.Project.Coffee.ConcreteDecorator;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Decorator.CoffeeDecorator;


public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + "\n Sugar: 50tg";
    }

    @Override
    public double cost() {
        return super.cost() + 50;
    }

}
