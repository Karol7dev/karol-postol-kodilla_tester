package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Polonez implements Car {

    private int speed;
    private int maxSpeed = 140;
    private String carName = "Polonez";

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        if (this.speed + 10 < this.maxSpeed)
            this.speed += 10;
        else
            this.speed = this.maxSpeed;
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed > 1)
            this.speed *= 0.50;
        else
            this.speed = 0;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polonez polonez = (Polonez) o;
        return speed == polonez.speed &&
                maxSpeed == polonez.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, maxSpeed);
    }
}