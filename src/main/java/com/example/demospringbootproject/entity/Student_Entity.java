package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student_Entity {
    @Id
    @GeneratedValue
    long id;
    String Name;
    int RollNO;
    String Classes;

    public Student_Entity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNO() {
        return RollNO;
    }

    public void setRollNO(int rollNO) {
        RollNO = rollNO;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }
}
