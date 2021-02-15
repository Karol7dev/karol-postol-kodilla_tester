package com.kodilla.spring.basic.dependecy_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;

public class Application {

    @Autowired
    private ShippingCenter shippingCenter;

    public void shippingCenter(){
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.shippingCenter();
    }
}