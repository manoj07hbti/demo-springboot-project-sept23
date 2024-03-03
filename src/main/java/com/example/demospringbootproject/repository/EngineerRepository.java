package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.EngineerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<EngineerEntity,Long> {
}
