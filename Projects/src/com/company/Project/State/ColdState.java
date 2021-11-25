package com.company.Project.State;

import com.company.Project.AbstractFactory.CoffeeStore;

public class ColdState implements State{

    @Override
    public void condition_drink(CoffeeStore drinks_condition) {
        System.out.println("You choose cold drink");
        drinks_condition.setState(this);
    }
}
