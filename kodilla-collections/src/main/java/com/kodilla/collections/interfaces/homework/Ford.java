package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;
    private int maxSpeed = 180;
    private String carName = "Ford";

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
        if (this.speed + 15 < this.maxSpeed)
            this.speed += 15;
        else
            this.speed = this.maxSpeed;
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed > 1)
            this.speed *= 0.45;
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
        Ford ford = (Ford) o;
        return speed == ford.speed &&
                maxSpeed == ford.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, maxSpeed);
    }
}