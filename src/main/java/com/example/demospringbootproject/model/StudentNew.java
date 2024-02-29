package com.example.demospringbootproject.model;

public class StudentNew {
    String studName;
    int studAge;
    int studId;
    String studSubj;

    public StudentNew(String studName, int studAge, int studId, String studSubj) {
        this.studName = studName;
        this.studAge = studAge;
        this.studId = studId;
        this.studSubj = studSubj;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudSubj() {
        return studSubj;
    }

    public void setStudSubj(String studSubj) {
        this.studSubj = studSubj;
    }
}
