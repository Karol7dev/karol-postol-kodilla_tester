package com.kodilla.abstracts;

public class StartJob {
    public static void main(String[] args) {
        Person tester = new Person("Adam", 30, new Tester(6000, "Testuje"));
        Person kierowca = new Person("Mariusz", 45, new Kierowca(3500, "Rozwozi"));

        System.out.println(tester.age +" " + tester.firstName+" "+tester.job.getSalary() + tester.job.getResponsibilities());
    }
}
