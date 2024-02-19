package com.example.demospringbootproject.test_18_feb_2024;

public class ModelBook
{
    private int id;
    private String name;
    private String subject;
    private String writer;
    private String allocationStatus;

    public ModelBook(int id, String name, String subject, String writer, String allocationStatus) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.writer = writer;
        this.allocationStatus = allocationStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }
}
