package com.example.demospringbootproject.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonSerialize
@Entity(name="STUDENT_9PM_SEPT")
public class Students {

    @Id
    @GeneratedValue
    long id;
    String name;
    int rollNo;
    String section;

    //

    public Students() {
    }

    public Students(long id, String name, int rollNo, String section) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // G and S;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
