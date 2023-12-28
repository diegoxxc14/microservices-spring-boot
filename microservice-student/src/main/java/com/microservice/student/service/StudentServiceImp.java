package com.microservice.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.student.entity.Student;
import com.microservice.student.persistence.StudentRepository;

@Service
public class StudentServiceImp implements IStudentService {

    @Autowired
    private StudentRepository studentRep;

    @Override
    public List<Student> findAll() {
        // Realizar casting porque findAll() devuelve un Iterable
        return (List<Student>) studentRep.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRep.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRep.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        // Usamos el método con la query personalizada
        return studentRep.findAllStudents(idCourse);
    }
    
}
