package com.example.demospringbootproject.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonSerialize
@Entity
public class StudentJava
{
    @Id
    @GeneratedValue
    long registration;
    String name;
    int rollno;
    String course;

    public StudentJava()
    {
    }

    public StudentJava(long registration, String name, int rollno, String course) {
        this.registration = registration;
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }

    public long getRegistration() {
        return registration;
    }

    public void setRegistration(long registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
