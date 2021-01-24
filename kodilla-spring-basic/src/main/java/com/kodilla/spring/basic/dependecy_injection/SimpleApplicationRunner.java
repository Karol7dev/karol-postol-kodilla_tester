package com.kodilla.spring.basic.dependecy_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {
        SimpleApplication application = new SimpleApplication();
        application.processMessage("Test message", "receiver@gmail.com");
    }
}
