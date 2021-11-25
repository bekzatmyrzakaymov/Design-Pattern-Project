package com.company.Project.AbstractFactory;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.ConcreteDecorator.*;
import com.company.Project.State.HotState;
import com.company.Project.State.State;
import com.company.Project.Strategy.Strategy;
import com.company.Project.Tea.ConcreteDecorator.Cinnamon;
import com.company.Project.Tea.ConcreteDecorator.DriedBerries;
import com.company.Project.Tea.Tea;

public abstract class CoffeeStore {
    public abstract Coffee createCoffee(String coffeeType);
    public abstract Tea createTea(Tea teaType);

    public Coffee addSugarToCoffee(Coffee coffeeType){
        return new Sugar(coffeeType);
    }

    public Coffee addMilkToCoffee(Coffee coffeeType){
        return new com.company.Project.Coffee.ConcreteDecorator.Milk(coffeeType);
    }

    public Coffee addCaramelSyrupToCoffee(Coffee coffeeType){
        return new CaramelSyrup(coffeeType);
    }

    public Coffee addWalnutSyrupToCoffee(Coffee coffeeType){
        return new WalnutSyrup(coffeeType);
    }

    public Coffee addMarshmallowToCoffee(Coffee coffeeType){
        return new Marshmallow(coffeeType);
    }

    public Tea addSugarToTea(Tea tea){
        return new com.company.Project.Tea.ConcreteDecorator.Sugar(tea);
    }

    public Tea addMilkToTea(Tea tea){
        return new com.company.Project.Tea.ConcreteDecorator.Milk(tea);
    }

    public Tea addCinnamonToTea(Tea tea){
        return new Cinnamon(tea);
    }

    public Tea addDriedBerriesToTea(Tea tea){
        return new DriedBerries(tea);
    }


    private State currentState;

    public CoffeeStore ()
    {
        currentState = new HotState();
    }

    public void setState(State state)
    {
        currentState = state;
    }

    public void getState()
    {
        currentState.condition_drink(this);
    }


    Strategy strategy;

    public  void takeCoffee(Strategy strategy){
        this.strategy = strategy;
        strategy.takeCoffee();
    }


}
