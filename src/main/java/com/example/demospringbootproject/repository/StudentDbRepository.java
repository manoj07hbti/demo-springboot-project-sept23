package com.example.demospringbootproject.repository;
import com.example.demospringbootproject.entity.StudentDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDbRepository extends JpaRepository<StudentDb, Long> {

    @Query(value = "SELECT MARKS  FROM (SELECT MARKS FROM STUDENT_DB ORDER BY MARKS DESC) WHERE ROWNUM < 2 ",nativeQuery = true)
    public int getHighestMarksSQL();

    @Query(value = "SELECT ROLL_NO  FROM (SELECT ROLL_NO FROM STUDENT_DB ORDER BY ROLL_NO DESC) WHERE ROWNUM < 2 ",nativeQuery = true)
    public int getHighestRollNoSQL();

    @Query(value = "SELECT * FROM STUDENT_DB WHERE SECTION= 'IT' AND MARKS > 60",nativeQuery = true)
    public List<StudentDb> findDivisionBranchSQL();
}
