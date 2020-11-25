package com.kodilla.abstracts;

public abstract class Job {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    private String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
