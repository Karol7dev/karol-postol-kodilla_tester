package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add( new Task("Inside raport", LocalDate.of(2020, 02,01), LocalDate.of(2020, 12, 20)));
        tasks.add( new Task("New grades", LocalDate.of(2020, 10,05), LocalDate.of(2020, 12, 28)));
        tasks.add( new Task("Buy Office Equipment", LocalDate.of(2020, 04, 22), LocalDate.of(2020, 7, 16)));
        tasks.add( new Task("Sell cars", LocalDate.of(2018, 05, 12), LocalDate.of(2020,  4, 9)));
        return tasks;
    }
}