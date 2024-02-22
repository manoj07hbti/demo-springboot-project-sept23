package com.example.demospringbootproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String repository(){
        return "Response from repository ";
    }

}
