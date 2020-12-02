package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Polonez;
import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("----------------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car max speed: " + car.getMaxSpeed());
        System.out.println("Car current speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Polonez)
            return "Polonez";
        else
            return "Unknown car name";
    }
}