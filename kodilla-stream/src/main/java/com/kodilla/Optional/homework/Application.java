package com.kodilla.Optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jon Snow");
        Teacher teacher2 = new Teacher("John Doe");
        Teacher teacher3 = new Teacher("Margaret Thatcher");

        Student student1 = new Student("Alex Hath", teacher3);
        Student student2 = new Student("Sylvanas Windrunner", null);
        Student student3 = new Student("Laura Greene", teacher1);
        Student student4 = new Student("Michael Jackson", null);

        List<Student> students = new ArrayList<>();
                students.add(student1);
                students.add(student2);
                students.add(student3);
                students.add(student4);

        for (Student student: students) {
//            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
//            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("student: " + student.getName() +" , teacher: " + student.getTeacher().getName());
        }
    }
}