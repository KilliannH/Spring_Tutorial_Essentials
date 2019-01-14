package com.killiann.Spring_Tutorial_Essentials.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {

    //field properties
    private UUID id;
    private final Integer age;
    private final String firstname;
    private final String lastname;
    private final String course;

    public Student(@JsonProperty("id") UUID id,
                   @JsonProperty("age") Integer age,
                   @JsonProperty("firstname") String firstname,
                   @JsonProperty("lastname") String lastname,
                   @JsonProperty("course") String course) {
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
    }

    //getters
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

    //setter
    public void setId(UUID id) {
        this.id = id;
    }
}
