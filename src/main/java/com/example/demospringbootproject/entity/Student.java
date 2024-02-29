package com.example.demospringbootproject.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    long Id;

    String Name;
    int Age;
    int RollNo;
    String Stream;

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
