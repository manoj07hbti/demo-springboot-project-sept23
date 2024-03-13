package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Doctor_Entity;
import com.example.demospringbootproject.entity.Employee_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor_Entity,Long> {

    public Doctor_Entity findByName(String name);

    public Doctor_Entity findByDepartment(String department);

    public Doctor_Entity findByNameAndDepartment(String name,String department);

    public Doctor_Entity findByIdAndName(Long id,String name);

    public Doctor_Entity findByIdAndDepartment(Long id,String department);
}
