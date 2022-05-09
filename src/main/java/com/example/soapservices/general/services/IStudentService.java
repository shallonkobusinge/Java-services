package com.example.soapservices.general.services;

import com.example.soapservices.general.domain.Student;
import com.example.soapservices.general.dto.SaveStudentDTO;

public interface IStudentService {
    Student saveStudent(SaveStudentDTO dto);
}
