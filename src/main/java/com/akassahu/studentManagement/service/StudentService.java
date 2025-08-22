package com.akassahu.studentManagement.service;

import com.akassahu.studentManagement.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllstudents();

    StudentDto getStudentById(Long id);
}
