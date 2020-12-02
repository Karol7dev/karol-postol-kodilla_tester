package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Train", 21, 24, false ));
        stamps.add(new Stamp("Boat", 21, 24, true ));
        stamps.add(new Stamp("Shark", 21, 24, false ));
        stamps.add(new Stamp("Train", 21, 24, true ));
        stamps.add(new Stamp("Train", 21, 24, false ));

        System.out.println("Stamp collection size: " + stamps.size());
        for(Stamp stamp: stamps  )
            System.out.println(stamp);
    }
}