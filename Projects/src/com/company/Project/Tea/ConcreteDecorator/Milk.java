package com.company.Project.Tea.ConcreteDecorator;

import com.company.Project.Tea.Decorator.TeaDecorator;
import com.company.Project.Tea.Tea;

public class Milk extends TeaDecorator {

    public Milk(Tea tea) {
        super( tea);
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
