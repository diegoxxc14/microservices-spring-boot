package com.microservice.course.http.response;

import java.util.List;

import com.microservice.course.dto.StudentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {
    
    private String courseName;
    private String teacher;
    private List<StudentDto> studentsDtoList;
}
