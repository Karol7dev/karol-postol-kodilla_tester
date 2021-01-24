package com.kodilla.spring.basic.dependecy_injection;

public class MessageService {

    public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to :" + receiver);
    }
}
