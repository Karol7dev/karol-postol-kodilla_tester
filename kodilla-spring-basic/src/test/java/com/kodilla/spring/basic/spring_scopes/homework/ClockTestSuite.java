package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldReturnDifferentTimes() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Thread.sleep(6000);
        Clock clock2 = context.getBean(Clock.class);
        Thread.sleep(5000);
        Clock clock3 = context.getBean(Clock.class);

//        assertFalse(clock1.equals(clock2));
//        assertFalse(clock2.equals(clock3));

        assertFalse(clock1.getTime().equals(clock2.getTime()));
        assertFalse(clock2.getTime().equals(clock3.getTime()));
    }
}