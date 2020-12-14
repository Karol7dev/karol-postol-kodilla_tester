package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        this.flights.add(new Flight("Warszawa","Wrocław"));
        this.flights.add(new Flight("London","Praga"));
        this.flights.add(new Flight("Ryga","Montreal"));
        this.flights.add(new Flight("New York","Paris"));
        this.flights.add(new Flight("Tokyo","Singapur"));
    }

    public List<Flight> getFlights() {
        return flights;
    }


}
