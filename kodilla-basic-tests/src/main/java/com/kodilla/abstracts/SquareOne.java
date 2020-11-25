package com.kodilla.abstracts;

public class SquareOne extends Shape {
    private int sideLength;

    public SquareOne(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    int getField() {
        return sideLength * sideLength;
    }

    @Override
    void getCircumference() {

    }
}
