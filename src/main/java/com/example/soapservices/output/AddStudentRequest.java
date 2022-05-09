package com.example.soapservices.output;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder = {
    "name",
    "age"
})
@XmlRootElement(name="addStudentRequest",namespace="https://example.ac.rw/soap/students")
public class AddStudentRequest {

    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected String name;
    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
