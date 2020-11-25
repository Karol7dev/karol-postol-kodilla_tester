package com.kodilla.collections.interfaces.homework;

public class CarInterface {
    public static void main(String[] args) {
        Audi audi = new Audi(200);
        doRace(audi);

        Ford ford = new Ford(140);
        doRace(ford);

        Polonez polonez = new Polonez(80);
        doRace(polonez);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed() + car.increaseSpeed() + car.increaseSpeed() + car.decreaseSpeed() + car.decreaseSpeed() + car.getSpeed());
    }
}