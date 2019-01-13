package com.killiann.Spring_Tutorial_Essentials.model;

import java.util.UUID;

public class Student {

    //field properties
    private final UUID id;
    private final Integer age;
    private final String firstname;
    private final String lastname;
    private final String course;

    public Student(UUID id, Integer age, String firstname, String lastname, String course) {
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCourse() {
        return course;
    }
}
