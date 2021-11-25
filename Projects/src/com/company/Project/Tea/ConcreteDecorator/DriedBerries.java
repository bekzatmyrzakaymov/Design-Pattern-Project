package com.company.Project.Tea.ConcreteDecorator;

import com.company.Project.Tea.Decorator.TeaDecorator;
import com.company.Project.Tea.Tea;

public class DriedBerries extends TeaDecorator {

    public DriedBerries(Tea tea) {
        super( tea);
    }

    @Override
    public String description() {
        return super.description() + "\nDriedBerries: 300tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }
}
