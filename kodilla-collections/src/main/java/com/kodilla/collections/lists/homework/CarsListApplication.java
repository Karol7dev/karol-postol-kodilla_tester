package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Polonez;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford();

        cars.add(new Audi());
        cars.add(new Polonez());
        cars.add(new Ford());
        cars.add(ford);

        for(Car car: cars)
            CarUtils.describeCar(car);

        cars.remove(0);

        Car ford2 = new Ford();
        ford2.setSpeed(180);

        cars.remove(ford2);
        System.out.println("#################################################");
        System.out.println("Current size of the Cars List is: " + cars.size());

        for(Car car: cars)
            CarUtils.describeCar(car);
    }
}