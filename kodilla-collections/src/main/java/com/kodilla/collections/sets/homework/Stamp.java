package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean hasStamp;


    public Stamp(String name, double width, double height, boolean hasStamp) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.hasStamp = hasStamp;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isHasStamp() {
        return hasStamp;
    }

    public String getDimensions() {
        return width + " x " + height;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", hasStamp=" + hasStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                hasStamp == stamp.hasStamp &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, hasStamp);
    }
}
