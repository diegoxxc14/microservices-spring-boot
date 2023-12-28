package com.microservice.course.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.course.entity.Course;
import com.microservice.course.service.ICourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    
    private ICourseService courseSer;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course) {
        courseSer.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse() {
        return ResponseEntity.ok(courseSer.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseSer.findById(id));
    }
}
