package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi();
        doRace(audi);

        Ford ford = new Ford();
        doRace(ford);

        Polonez polonez = new Polonez();
        doRace(polonez);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getCarName() + " " +car.getSpeed());
    }
}