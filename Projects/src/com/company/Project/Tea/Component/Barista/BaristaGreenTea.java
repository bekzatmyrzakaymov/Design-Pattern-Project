package com.company.Project.Tea.Component.Barista;

import com.company.Project.Tea.Tea;

public class BaristaGreenTea implements Tea {
    @Override
    public String description() {
        return "Your choice is Barista Green Tea - 400 tg";
    }

    @Override
    public double cost() {
        return 400;
    }
}
