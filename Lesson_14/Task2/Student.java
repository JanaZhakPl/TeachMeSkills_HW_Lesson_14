package com.teachmeskills.Lesson_14.Task2;

public class Student {
    private String firstName;

    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
