package com.example.demospringbootproject.entity;

import javax.persistence.*;

@Entity(name = "STUDENT_MANAGEMENT")
public class StudentNew {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    Long id;

    String name;
    int rollNo;
    int marks;
    String section;

    public StudentNew() {
    }

    public StudentNew(Long id, String name, int rollNo, int marks, String section) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
