package com.microservice.student.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.student.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    // Formas de realizar la misma consulta: 
    // 1) Query personalizado. 
    @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    List<Student> findAllStudents(Long idCourse);

    // 2) Usando la notación de JPA
    List<Student> findAllByCourseId(Long idCourse);
}
