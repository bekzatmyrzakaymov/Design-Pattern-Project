package com.company.Project.Tea.Component.Fabric;

import com.company.Project.Tea.Tea;

public class FabricBlackTea implements Tea {

    @Override
    public String description() {
        return "Your choice is Fabric Black Tea - 300 tg";
    }

    @Override
    public double cost() {
        return 300;
    }
}
