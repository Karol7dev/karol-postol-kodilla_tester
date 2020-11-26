package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(200);
        doRace(audi);

        Ford ford = new Ford(140);
        doRace(ford);

        Polonez polonez = new Polonez(80);
        doRace(polonez);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}