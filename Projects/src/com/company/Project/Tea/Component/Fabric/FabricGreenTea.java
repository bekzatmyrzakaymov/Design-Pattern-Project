package com.company.Project.Tea.Component.Fabric;

import com.company.Project.Tea.Tea;

public class FabricGreenTea implements Tea {
    @Override
    public String description() {
        return "Your choice is Fabric Green Tea - 400 tg";
    }

    @Override
    public double cost() {
        return 400;
    }
}
