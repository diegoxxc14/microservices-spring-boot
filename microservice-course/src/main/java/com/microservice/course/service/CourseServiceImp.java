package com.microservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.persistence.ICourseRepository;

@Service
public class CourseServiceImp implements ICourseService {

    @Autowired
    private ICourseRepository courseRep;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRep.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRep.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRep.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {
        // Consultar el curso
        Course course = courseRep.findById(idCourse).orElse(null);

        // Obtener los estudiantes (Mediante el microservicio)
        List<StudentDto> studentDtosList = studentClient.findAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentsDtoList(studentDtosList).build();
    }
    
}
