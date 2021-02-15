package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class CarFactory {

    @Bean
    public Car selectCar(){
        String season = SeasonsSelector.getSeason(LocalDate.now());
        int hour = LocalTime.now().getHour();
        Car car;
        switch (season){
            case "Summer":
                car = new Cabrio();
                break;
            case "Winter":
                car = new SUV();
                break;
            default:
                car = new Sedan();
        }
        if(hour >=20 || hour <= 6){
            car.lightsOn();
        } else {
            car.lightsOff();
        }
        return car;
    }
}