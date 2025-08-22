package com.akassahu.studentManagement.controller;

import com.akassahu.studentManagement.dto.StudentDto;
import com.akassahu.studentManagement.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<StudentDto> getAllStudent(){
        return studentService.getAllstudents();
    }

    @GetMapping("/students/{id}")
        public StudentDto getStudentById(@PathVariable Long id){
            return studentService.getStudentById(id);
        }

}
