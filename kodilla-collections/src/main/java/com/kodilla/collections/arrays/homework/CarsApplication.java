package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Polonez;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();

        int drawCarType = random.nextInt(3);
        int assignedSpeed;

        if (drawCarType == 0) {
            Audi audi = new Audi();
            assignedSpeed = random.nextInt(audi.getMaxSpeed()+1);
            audi.setSpeed(assignedSpeed);
            return audi;
        } else if (drawCarType == 1){
            Ford ford = new Ford();
            assignedSpeed = random.nextInt(ford.getMaxSpeed()+1);
            ford.setSpeed(assignedSpeed);
            return ford;
        } else {
            Polonez polonez = new Polonez();
            assignedSpeed = random.nextInt(polonez.getMaxSpeed());
            polonez.setSpeed(assignedSpeed);
            return polonez;
        }

    }
}