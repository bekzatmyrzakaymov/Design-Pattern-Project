package com.company.Project.Coffee.Component.Fabric;

import com.company.Project.Coffee.Coffee;

public class FabricAmericano implements Coffee {

    @Override
    public String description() {
        return "Your choice is Fabric Americano - 600tg";
    }

    @Override
    public double cost() {
        return 600;
    }
}
