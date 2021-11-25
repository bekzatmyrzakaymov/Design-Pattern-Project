package com.company.Project.Observer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApplication implements Observable{

    private final List<String> discounts = new ArrayList<>();
    private final List<Observer> subscribers = new ArrayList<>();

    public void addDiscount(String tour){
        this.discounts.add(tour);
        notifyAllMembers();
    }

    public void removeDiscount(String tour){
        this.discounts.remove(tour);
        notifyAllMembers();
    }


    @Override
    public void registerUser(Observer user) {
        this.subscribers.add(user);
    }

    @Override
    public void unregisterUser(Observer user) {
        this.subscribers.remove(user);
    }

    @Override
    public void notifyAllMembers() {
        for(Observer user: subscribers){
            user.update();
        }
    }

    public List<String> getDiscounts() {
        return discounts;
    }
}
