package com.company.Project.AbstractFactory;

import com.company.Project.Coffee.Coffee;
import com.company.Project.Coffee.Component.Barista.BaristaAmericano;
import com.company.Project.Coffee.Component.Barista.BaristaCappucino;
import com.company.Project.Coffee.Component.Barista.BaristaEspresso;
import com.company.Project.Coffee.Component.Barista.BaristaLatte;
import com.company.Project.Tea.Tea;

public class PreparedByBaristaDrinks extends CoffeeStore{

    @Override
   public Coffee createCoffee(String coffeeType) {
        Coffee coffee = null;
        switch (coffeeType){
            case ("Americano"):
                coffee = new BaristaAmericano();
                break;

            case ("Latte"):
                coffee = new BaristaLatte();
                break;

            case ("Espresso"):
                coffee=new BaristaEspresso();
                break;

            case ("Cappucino"):
                coffee=new BaristaCappucino();
                break;
        }
        return coffee;
    }


    @Override
  public Tea createTea(Tea teaType) {
        return teaType;
    }

}
