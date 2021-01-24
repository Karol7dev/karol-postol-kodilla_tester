package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TasksManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        List<LocalDate> daty = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().isAfter(currentDate))
                .map(task -> task.getDeadline())
                .collect(Collectors.toList());

        List<String> names = TaskRepository.getTasks().stream().filter(d -> d.getDeadline().isAfter(currentDate))
                .map(task -> task.getName())
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(daty); // a jakbym chciał jeszcze nazwy?
    }
}