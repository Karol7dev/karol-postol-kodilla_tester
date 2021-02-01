package com.kodilla.homework;

public interface WeatherSubscriber {

    /*
     * Sends notification to all users form all locations
     */
    void receive(WeatherNotification notification);
}