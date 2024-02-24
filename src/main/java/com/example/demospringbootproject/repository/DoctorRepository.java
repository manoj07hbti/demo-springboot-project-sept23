package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Doctor_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor_Entity,Long> {
}
