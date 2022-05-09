package com.example.soapservices.general.services;

import com.example.soapservices.general.domain.Student;
import com.example.soapservices.general.dto.SaveStudentDTO;
import com.example.soapservices.general.repository.StudentRepository;
import com.example.soapservices.output.AddStudentRequest;
import com.example.soapservices.output.GetStudentRequest;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(AddStudentRequest dto) {
        return studentRepository.save(new Student(dto));
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }
}
