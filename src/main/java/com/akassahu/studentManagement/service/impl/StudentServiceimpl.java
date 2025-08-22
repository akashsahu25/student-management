package com.akassahu.studentManagement.service.impl;

import com.akassahu.studentManagement.dto.StudentDto;
import com.akassahu.studentManagement.entity.Student;
import com.akassahu.studentManagement.repository.StudentRepository;
import com.akassahu.studentManagement.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceimpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getAllstudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> modelMapper.map(student , StudentDto.class)).toList();
    }

    @Override
    public StudentDto getStudentById(Long id){
       Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student Not Found with id "+ id));
       StudentDto studentDto = modelMapper.map(student , StudentDto.class);
       return studentDto;
    }
}

