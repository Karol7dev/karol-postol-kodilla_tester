package com.kodilla.inheritance;

public class Linux extends OperatingSystem {
    int year = 1991;

    @Override
    public void turnOn() {
        System.out.println("Turning on Linux");
    }

    public Linux(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Linux");
    }

}
