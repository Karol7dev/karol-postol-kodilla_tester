package com.kodilla.inheritance;

public class OperatingSystem {
    int year = 1985;

    public void turnOn() {
        System.out.println("Turning On...");
    }

    public void turnOff() {
        System.out.println("Turning off...");
    }

    public OperatingSystem(int year) {
        this.year = year;
    }
}
