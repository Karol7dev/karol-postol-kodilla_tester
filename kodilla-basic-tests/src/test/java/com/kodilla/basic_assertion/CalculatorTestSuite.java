package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {



    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtrack() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtrackResult = calculator.subtrack(a, b);
        assertEquals(-3, subtrackResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = -4;
        int squareResult = calculator.square(a);
        assertEquals(16, squareResult);
    }
}
