package com.example.soapservices.general.endpoints;

import com.example.soapservices.general.domain.Student;
import com.example.soapservices.general.repository.StudentRepository;
import com.example.soapservices.general.services.StudentServiceImpl;
import com.example.soapservices.output.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {

     @Autowired
    private StudentRepository studentRepository;

     @Autowired
    private StudentServiceImpl studentService;

     @PayloadRoot(namespace = "https://example.ac.rw/soap/students", localPart = "GetStudentRequest")
     @ResponsePayload
    public GetStudentResponse getStudentDetails(@RequestPayload GetStudentRequest request) {
        GetStudentResponse response = new GetStudentResponse();
         StudentInfo studentInfo = new StudentInfo();
         BeanUtils.copyProperties(studentService.getStudent(request.getId()), studentInfo);
         response.setStudentInfos(studentInfo);
         return response;
     }

     @PayloadRoot(namespace = "https://example.ac.rw/soap/students", localPart = "addStudentRequest")
    @ResponsePayload
    public AddStudentResponse addStudent(@RequestPayload AddStudentRequest request) {
        AddStudentResponse response = new AddStudentResponse();
        StudentInfo studentInfo = new StudentInfo();
        BeanUtils.copyProperties(studentService.saveStudent(request), studentInfo);
        response.setStudentInfo(studentInfo);
        return response;
     }
}
