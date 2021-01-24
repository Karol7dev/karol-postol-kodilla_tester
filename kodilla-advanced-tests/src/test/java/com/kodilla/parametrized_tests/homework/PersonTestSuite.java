//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PersonTestSuite {
//
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMIValues#provideParamsForBMICalculationTest")
//    public void shouldReturnStringValuesAccordinglyToMBI(double heightInMeters, double weightInKg, String expected){
//        assertEquals(expected, new Person(heightInMeters, weightInKg).getBMI());
//    }
//}