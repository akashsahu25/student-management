package com.akassahu.studentManagement.service.impl;

import com.akassahu.studentManagement.dto.StudentDto;
import com.akassahu.studentManagement.repository.StudentRepository;
import com.akassahu.studentManagement.service.StudentService;

import java.util.List;

public class StudentServiceimpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllstudents() {
        return List.of();
    }
}

