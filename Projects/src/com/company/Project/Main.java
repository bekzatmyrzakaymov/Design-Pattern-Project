package com.company.Project;
import com.company.Project.Facade.OrderFacade;
import com.company.Project.Facade.OrderFacadeImpl;

public class Main {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacadeImpl();
        orderFacade.order();
    }
}
