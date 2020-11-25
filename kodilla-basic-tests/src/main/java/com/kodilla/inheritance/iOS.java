package com.kodilla.inheritance;

public class iOS extends Linux {
    int year = 2007;

    @Override
    public void turnOn() {
        System.out.println("Turning on iOS");
    }

    public iOS(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off iOS");
    }
}
