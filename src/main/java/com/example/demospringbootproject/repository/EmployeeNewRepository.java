package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Doctor;
import com.example.demospringbootproject.entity.EmployeeNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeNewRepository extends JpaRepository<EmployeeNew,Long> {
    public EmployeeNew findById(long id);
    public EmployeeNew findByName(String name);
    public EmployeeNew findByCityAndName(String city,String name);

}
