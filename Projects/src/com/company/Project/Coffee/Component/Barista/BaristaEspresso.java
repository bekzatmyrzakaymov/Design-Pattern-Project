package com.company.Project.Coffee.Component.Barista;

import com.company.Project.Coffee.Coffee;

public class BaristaEspresso implements Coffee {

    @Override
    public String description() {
        return "Your choice is Barista Espresso - 700 tg";
    }

    @Override
    public double cost() {
        return 700;
    }
}
