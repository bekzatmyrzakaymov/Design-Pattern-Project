package com.company.Project.State;

import com.company.Project.AbstractFactory.CoffeeStore;

public class HotState implements State{

    @Override
    public void condition_drink(CoffeeStore drinks_condition) {
        System.out.println("You choose hot drink");
        drinks_condition.setState(this);
    }
}
