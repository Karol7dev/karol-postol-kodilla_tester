package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtrack(int a, int b) {
        return a - b;
    }

    public int square(int a) {
        return a * a;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtrackResult = calculator.subtrack(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtrackResult);
        if (correct2) {
            System.out.println("Metoda róźnicy działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda róźnicy nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda podnoszenia do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie dla liczby " + a);
        }
    }
}