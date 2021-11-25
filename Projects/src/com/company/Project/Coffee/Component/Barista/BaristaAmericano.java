package com.company.Project.Coffee.Component.Barista;

import com.company.Project.Coffee.Coffee;

public class BaristaAmericano implements Coffee {

    @Override
    public String description() {
        return "Your choice is Barista Americano coffee - 550 tg";
    }

    @Override
    public double cost() {
        return 550;
    }
}
