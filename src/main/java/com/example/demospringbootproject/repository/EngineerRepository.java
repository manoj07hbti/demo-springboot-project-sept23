package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Engineer_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer_Entity,Long > {
}
