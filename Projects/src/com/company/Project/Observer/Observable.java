package com.company.Project.Observer;

public interface Observable {
    void registerUser(Observer observer);
    void unregisterUser(Observer observer);
    void notifyAllMembers();
}
