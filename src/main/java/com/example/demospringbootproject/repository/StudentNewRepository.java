package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.StudentNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface StudentNewRepository extends JpaRepository<StudentNew,Long> {
    @Query(value = "SELECT * FROM STUDENT_MANAGEMENT",nativeQuery = true)
    public List<StudentNew> getAllStudentsSQL();
    @Modifying
    @Query(value = "UPDATE STUDENT_MANAGEMENT SET NAME=:name WHERE ID=:id",nativeQuery = true)
    public void updateNameByIdSQL(@Param("name") String name,@Param("id") long id);

    @Modifying
    @Query(value = "DELETE FROM STUDENT_MANAGEMENT WHERE ID=:id",nativeQuery = true)
    public void removeStudentSQL();

    @Query(value = "SELECT MARKS  FROM (SELECT MARKS FROM STUDENT_MANAGEMENT  ORDER BY MARKS DESC) WHERE ROWNUM < 2",nativeQuery = true)
    public int getHighestMarksSQL();

    @Query(value = "SELECT ROLL_NO FROM (SELECT ROLL_NO FROM STUDENT_MANAGEMENT ORDER BY ROLL_NO DESC)WHERE ROWNUM <2",nativeQuery = true)
    public int getHighestRollNoSQL();
    @Query(value = "SELECT * FROM STUDENT_MANAGEMENT WHERE SECTION= 'IT' AND MARKS > 60",nativeQuery = true)
    public List<StudentNew> getFirstDivisionStudentsSQL();
}
