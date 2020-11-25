package com.kodilla.inheritance;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning On Windows");
    }

    public void turnOff() {
        System.out.println("Turning off Windows");
    }

    public int getYear() {
        return year;
    }
}