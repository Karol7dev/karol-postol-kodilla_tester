package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed = speed + 60;
    }

    public void decreaseSpeed() {
        this.speed = speed - 50;
    }
}