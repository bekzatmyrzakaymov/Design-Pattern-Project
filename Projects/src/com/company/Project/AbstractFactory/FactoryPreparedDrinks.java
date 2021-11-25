package com.company.Project.AbstractFactory;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Component.Fabric.FabricAmericano;
import com.company.Project.Coffee.Component.Fabric.FabricCappucino;
import com.company.Project.Coffee.Component.Fabric.FabricEspresso;
import com.company.Project.Coffee.Component.Fabric.FabricLatte;
import com.company.Project.Tea.Tea;

public class FactoryPreparedDrinks extends CoffeeStore{

    @Override
    public Coffee createCoffee(String coffeeType) {
        Coffee coffee = null;

        switch (coffeeType){
            case ("Americano"):
                coffee = new FabricAmericano();
                break;

            case ("Latte"):
                coffee = new FabricLatte();
                break;

            case ("Espresso"):
                coffee=new FabricEspresso();
                break;

            case ("Cappucino"):
                coffee=new FabricCappucino();
                break;

        }
        return coffee;
    }

    @Override
    public Tea createTea(Tea teaType) {
        return teaType;
    }



}
