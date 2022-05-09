package com.example.soapservices.general.services;

import com.example.soapservices.general.domain.Student;
import com.example.soapservices.general.dto.SaveStudentDTO;
import com.example.soapservices.output.AddStudentRequest;

public interface IStudentService {
    Student saveStudent(AddStudentRequest dto);
    Student getStudent(Long id);
}
