package com.company.Project.Tea.ConcreteDecorator;

import com.company.Project.Tea.Decorator.TeaDecorator;
import com.company.Project.Tea.Tea;

public class Cinnamon extends TeaDecorator {

    public Cinnamon(Tea tea) {
        super( tea);
    }

    @Override
    public String description() {
        return super.description() + "\nCinnamon: 100tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 100;
    }
}
