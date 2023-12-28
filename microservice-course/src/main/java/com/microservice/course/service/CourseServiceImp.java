package com.microservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.course.entity.Course;
import com.microservice.course.persistence.ICourseRepository;

public class CourseServiceImp implements ICourseService {

    @Autowired
    private ICourseRepository courseRep;

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
    
}
