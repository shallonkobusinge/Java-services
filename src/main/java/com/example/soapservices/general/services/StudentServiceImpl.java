package com.example.soapservices.general.services;

import com.example.soapservices.general.domain.Student;
import com.example.soapservices.general.dto.SaveStudentDTO;
import com.example.soapservices.general.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(SaveStudentDTO dto) {
        return studentRepository.save(new Student(dto));
    }
}
