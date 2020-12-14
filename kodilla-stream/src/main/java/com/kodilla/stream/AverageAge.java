package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
//        UsersRepository.getUsersList()
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}