package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingNumbers.csv")
    public void shouldReturnTrueIfNumberOfWinsIsZeroOrMore(String numStr) throws InvalidNumbersException {
        String[] stringNumbers = numStr.split(" ");

        Set<Integer> numbersFromFile = new HashSet<>();
        for(String str: stringNumbers){
            numbersFromFile.add(Integer.parseInt(str));
        }

        GamblingMachine gamblingMachine = new GamblingMachine();

        int winsCount = gamblingMachine.howManyWins(numbersFromFile);
        assertTrue(winsCount >= 0);
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/gamblingNumbersLoosing.csv")
//    public void shouldAlwaysReturnZeroAsWinsCount_PassedNumbersAreOutOfTheRange(String numstr) throws InvalidNumbersException {
//        NumbersGenerator numbersGenerator = new NumbersGenerator();
////        GamblingMachine gamblingMachine = new GamblingMachine(numbersGenerator);
//        Set<Integer> numbersFromFile = new HashSet<>();
//        List<String> stringNumbers = new ArrayList<String>(Arrays.asList(numstr.split(":")));
//        for(String str: stringNumbers){
//            numbersFromFile.add(Integer.parseInt(str));
//        }
//
//        int winsCount = gamblingMachine.howManyWins(numbersFromFile);
//        assertEquals(0, winsCount);
//    }

//    @Test
//    public void withMockNumbers() throws InvalidNumbersException{
//        NumbersGenerator numbersGenerator = Mockito.mock(NumbersGenerator.class);
//        GamblingMachine gamblingMachine = new GamblingMachine(numbersGenerator);
//        Mockito.when(numbersGenerator.generate()).thenReturn(new   HashSet<Integer>(){{
//            add(29); add(21); add(22);
//            add(23); add(24); add(25);
//        }});
//        Set<Integer> numbers = new HashSet<Integer>(){{
//            add(29); add(21); add(22);
//            add(23); add(24); add(25);
//        }};
//        assertEquals(6, gamblingMachine.howManyWins(numbers));
//    }

//    @Test
//    public void shouldThrowAnExceptionIfIncorrectNumbersCount(){
//        NumbersGenerator numbersGenerator = new NumbersGenerator();
//        GamblingMachine gamblingMachine = new GamblingMachine(numbersGenerator);
//        // passing 4 numbers but 6 is required
//        Set<Integer> numbers = new HashSet<Integer>(){{
//            add(23);
//            add(45);
//            add(17);
//            add(5);
//        }};
//        Assertions.assertThrows(InvalidNumbersException.class, () ->{ gamblingMachine.howManyWins(numbers); });
//    }
}