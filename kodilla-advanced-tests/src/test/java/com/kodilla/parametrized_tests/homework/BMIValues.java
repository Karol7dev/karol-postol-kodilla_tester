package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMIValues {
    static Stream<Arguments> provideParamsForBMICalculationTest(){
        return Stream.of(
                Arguments.of(1.74,100,"Obese Class I (Moderately obese)"),
                Arguments.of(1.89, 90, "Overweight" ),
                Arguments.of(1.73, 65, "Normal (healthy weight)"),
                Arguments.of(1.55,90, "Obese Class II (Severely obese)"),
                Arguments.of(1.80, 51, "Severely underweight"),
                Arguments.of(2.05, 51, "Very severely underweight"),
                Arguments.of(1.70,170, "Obese Class V (Super Obese)"),
                Arguments.of(0, 0, "<Data [weight,height] may be incorrect. Please check it again.>")
        );
    }
}