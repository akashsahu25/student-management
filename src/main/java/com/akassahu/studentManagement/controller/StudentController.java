package com.akassahu.studentManagement.controller;

import com.akassahu.studentManagement.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(1,"Akash");
    }

}
