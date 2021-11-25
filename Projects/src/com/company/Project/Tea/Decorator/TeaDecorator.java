package com.company.Project.Tea.Decorator;


import com.company.Project.Tea.Tea;

public class TeaDecorator implements Tea {

    Tea tea;
    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }
    @Override
    public String description() {
        return tea.description();
    }

    @Override
    public double cost() {
        return tea.cost();
    }
}
