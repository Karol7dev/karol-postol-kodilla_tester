package com.kodilla.spring.basic.dependecy_injection.homework;

public interface DeliveryService {
    boolean deliverPackage(String address, double weight);
}

// public boolean deliverPackage(String address, double weight) {
//      if (weight > 30) {
//         System.out.println("Package too heavy");
//         return false;
//      }
//      System.out.println("Delivering in progress...");
//      return true;
//   }
//}