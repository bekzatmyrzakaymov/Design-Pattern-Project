package com.company.Project.Tea.Component.Barista;

import com.company.Project.Tea.Tea;

public class BaristaFruitTea implements Tea {

    @Override
    public String description() {
        return "Your choice is Barista Fruit Tea - 600tg";
    }

    @Override
    public double cost() {
        return 600;
    }
}
