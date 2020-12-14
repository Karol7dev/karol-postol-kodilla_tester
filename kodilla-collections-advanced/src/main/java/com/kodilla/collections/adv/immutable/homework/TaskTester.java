package com.kodilla.collections.adv.immutable.homework;

public class TaskTester {

    public static void main(String[] args) {
        Task task = new Task("Video", 120);
        System.out.println(task.getTitle() + " last: " + task.getDuration() + " min");
    }
}