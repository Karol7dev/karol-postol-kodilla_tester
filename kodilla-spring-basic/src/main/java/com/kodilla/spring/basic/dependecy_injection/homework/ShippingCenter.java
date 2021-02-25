package com.kodilla.spring.basic.dependecy_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;

public class ShippingCenter {

    private DeliveryService deliveryService;

    private NotificationService notificationService;


    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }

    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter();
        shippingCenter.sendPackage("Cokolwiek", 20.2);
    }
}