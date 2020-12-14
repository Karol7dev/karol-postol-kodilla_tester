package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");
        Assertions.assertEquals(1,result.size());
    }

    @Test
    public void testFindFlightTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Montreal");
        System.out.println("result :" + result.size());
        Assertions.assertEquals(1,result.size());
    }
}
