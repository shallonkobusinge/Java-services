package com.example.soapservices.output;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "studentInfos"
})
@XmlRootElement(name = "GetStudentResponse", namespace = "https://example.ac.rw/soap/students")
public class GetStudentResponse {
    @XmlElement(namespace = "https://example.ac.rw/soap/students")
    private StudentInfo studentInfos;

    public StudentInfo getStudentInfos() {
        return studentInfos;
    }

    public void setStudentInfos(StudentInfo studentInfos) {
        this.studentInfos = studentInfos;
    }
}

