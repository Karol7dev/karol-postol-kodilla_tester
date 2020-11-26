package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed = speed + 50;
    }

    public void decreaseSpeed() {
        this.speed = speed - 35;
    }
}