package com.company.Project.Tea.ConcreteDecorator;

import com.company.Project.Tea.Decorator.TeaDecorator;
import com.company.Project.Tea.Tea;

public class Sugar extends TeaDecorator {

    public Sugar(Tea tea) {
        super(tea);
    }

    @Override
    public String description() {
        return super.description() + "\nSugar:50tg";
    }

    @Override
    public double cost() {
        return super.cost() + 50;
    }

}
