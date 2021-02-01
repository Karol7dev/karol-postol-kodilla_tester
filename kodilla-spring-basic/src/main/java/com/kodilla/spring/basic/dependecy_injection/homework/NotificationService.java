package com.kodilla.spring.basic.dependecy_injection.homework;

public interface NotificationService {
    void success(String address);

    void fail(String address);
}

// BYŁO TAK
//public void success(String address) {
//    System.out.println("Package delivered to: " + address);
//}
//
//    public void fail(String address) {
//        System.out.println("Package not delivered to: " + address);
//    }
//}