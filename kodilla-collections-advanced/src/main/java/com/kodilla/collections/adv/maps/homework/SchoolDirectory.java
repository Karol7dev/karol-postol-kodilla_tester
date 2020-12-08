package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<School, Principal> schools = new HashMap<>();

        School birkbeck = new School("Birkbeck University London", 120,160,350,180,200, 320, 200,180 );
        School lse = new School("London School of Economics and Political Studies", 200,280,350,300,220,80);

        Principal birkbeckPrincipal = new Principal("Ian Harrison");
        Principal lsePrincipal = new Principal("Dame Nemat Shafik");

        schools.put(birkbeck, birkbeckPrincipal);
        schools.put(lse, lsePrincipal);

        for(Map.Entry<School, Principal> entry: schools.entrySet()){
            System.out.println(entry.getValue().getName() + " is a principal of " + entry.getKey().getName()
                    + " with total of: " + entry.getKey().getStudentsTotal() + " students.");
        }
    }
}