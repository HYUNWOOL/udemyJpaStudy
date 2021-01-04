package com.udemyJpa.study.forUdemyJpa.repository;

import com.udemyJpa.study.forUdemyJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("from Student")
    List<Student> findAllStudents();

    @Query("select st.firstName,st.lastName from Student st")
    List<Object[]> findAllStudentsPart();

    @Query("from Student where firstName = :firstName")
    List<Student> findAllStudentByFirstName(@Param("firstName") String firstName);

    @Query("from Student where score >:min and score <:max")
    List<Student> findAllStudentForGivenScores(@Param("min") Long min,@Param("max") Long max);

    @Modifying
    @Query("delete from Student where firstName =:firstName")
    void deleteStudentsByFirstName(@Param("firstName") String firstName);
}
