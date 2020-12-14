package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostOver40yo = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Average post count for people at age 40 and above is : " + avgPostOver40yo);

        double avgPostBelow40yo = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Average post count for people at age below 40 is : " + avgPostBelow40yo);
    }
}