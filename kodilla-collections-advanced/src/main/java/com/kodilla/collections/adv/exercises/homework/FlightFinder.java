package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> tempList = new ArrayList<>();
        FlightRepository flightRepository = new FlightRepository();
        for (Flight flight : flightRepository.getFlights())
            if (flight.getDeparture() == departure) tempList.add(flight);
        return tempList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> tempList = new ArrayList<>();
        FlightRepository flightRepository = new FlightRepository();
        for (Flight flight : flightRepository.getFlights())
            if (flight.getArrival() == arrival) tempList.add(flight);
        return tempList;
    }
}