package com.company.Project.Coffee.Component.Fabric;

import com.company.Project.Coffee.Coffee;

public class FabricCappucino implements Coffee {
    @Override
    public String description() {
        return "Your choice is Fabric Cappuccino - 600 tg";
    }

    @Override
    public double cost() {
        return 600;
    }

}
