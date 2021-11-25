package com.company.Project.Coffee.Component.Barista;

import com.company.Project.Coffee.Coffee;

public class BaristaCappucino implements Coffee {

    @Override
    public String description() {
        return "Your choice is Barista Cappuccino - 600 tg";
    }

    @Override
    public double cost() {
        return 600;
    }
}
