package com.kodilla.collections.interfaces.homework;

public class Polonez implements Car {

    private int speed;

    public Polonez(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed = speed + 20;
    }

    public void decreaseSpeed() {
        this.speed = speed - 25;
    }
}