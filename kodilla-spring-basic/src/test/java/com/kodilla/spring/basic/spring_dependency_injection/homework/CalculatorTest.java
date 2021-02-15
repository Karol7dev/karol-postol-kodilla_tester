package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {
    private ApplicationContext context;
    private Calculator calculator;

    private int suma;

    @BeforeEach
    public void setSum() {
        suma = 0;
    }

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework"); // [1]
        calculator = context.getBean(Calculator.class);
    }

    @Test
    public void testAddition() {
        System.out.println("Wynik na początku pirwszego testu równa się " + suma);
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework"); // [1]
//        Calculator calculator = context.getBean(Calculator.class);
        double sum = calculator.add(2, 23);
        assertEquals(25, sum);
        suma = suma + 2;
        System.out.println("Wynik na koncu pierwszego testu " + suma);
    }

    @Test
    public void testDivide() throws ZeroUsageException {
        System.out.println("Suma z drugiego testu " + suma);
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework"); // [1]
//        Calculator calculator = context.getBean(Calculator.class);
        double divide = calculator.divide(100, 5);
        assertEquals(20, divide);
    }

    @Test
    public void testSubtract() {
        double subtract = calculator.subtract(10, 3);
        assertEquals(7, subtract);
    }

    @Test
    public void testMultiply() {
        double multiply = calculator.multiply(3, 4);
        assertEquals(12, multiply);
    }
}