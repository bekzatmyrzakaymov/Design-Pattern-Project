package com.company.Project.Coffee.Component.Fabric;

import com.company.Project.Coffee.Coffee;

public class FabricLatte implements Coffee {
    @Override
    public String description() {
        return "Your choice is Fabric Latte - 550 tg";
    }

    @Override
    public double cost() {
        return 550;
    }
}
