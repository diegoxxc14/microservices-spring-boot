package com.microservice.course.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.course.dto.StudentDto;

// Configuración del microservicio a consultar
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")  
public interface StudentClient {
    
    // Endoint del microservicio a consultar
    @GetMapping("/search-by-couser/{idCourse}")
    List<StudentDto> findAllStudentByCourse(@PathVariable Long idCourse);
}
