package com.akassahu.studentManagement.controller;

import com.akassahu.studentManagement.dto.StudentDto;
import com.akassahu.studentManagement.entity.Student;
import com.akassahu.studentManagement.repository.StudentRepository;
import com.akassahu.studentManagement.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/student")
    public List<StudentDto> getStudent(){
        return studentService.getAllstudents();
    }

}
