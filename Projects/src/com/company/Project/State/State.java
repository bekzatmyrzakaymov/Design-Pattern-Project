package com.company.Project.State;

import com.company.Project.AbstractFactory.CoffeeStore;

public interface State {
    void condition_drink(CoffeeStore drinks_condition);
}
