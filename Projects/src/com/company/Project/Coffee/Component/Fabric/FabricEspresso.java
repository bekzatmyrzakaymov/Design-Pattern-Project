package com.company.Project.Coffee.Component.Fabric;

import com.company.Project.Coffee.Coffee;

public class FabricEspresso implements Coffee {

    @Override
    public String description() {
        return "Your choice is Fabric Espresso - 700tg";
    }

    @Override
    public double cost() {
        return 700;
    }
}
