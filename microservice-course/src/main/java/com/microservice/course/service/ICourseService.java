package com.microservice.course.service;

import java.util.List;

import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

public interface ICourseService {
    
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    // Método que va llamar al microservicio de Student
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
