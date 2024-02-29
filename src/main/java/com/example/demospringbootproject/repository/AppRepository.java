package com.example.demospringbootproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

    public String demoRepo(){

        return "Response from Repository....";
    }
}
