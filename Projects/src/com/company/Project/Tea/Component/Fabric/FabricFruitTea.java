package com.company.Project.Tea.Component.Fabric;

import com.company.Project.Tea.Tea;

public class FabricFruitTea implements Tea {

    @Override
    public String description() {
        return "Your choice is Fabric Fruit Tea - 600 tg";
    }

    @Override
    public double cost() {
        return 600;
    }
}
