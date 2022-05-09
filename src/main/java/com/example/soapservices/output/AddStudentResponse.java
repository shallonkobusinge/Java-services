package com.example.soapservices.output;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder = {
        "studentInfo"
})
@XmlRootElement(name="addStudentResponse", namespace = "https://example.ac.rw/soap/students")
public class AddStudentResponse {
    @XmlElement(required = true, namespace = "https://example.ac.rw/soap/students")
    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    private StudentInfo studentInfo;

}
