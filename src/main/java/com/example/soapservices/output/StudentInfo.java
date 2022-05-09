package com.example.soapservices.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentDetails",namespace = "https://example.ac.rw/soap/students", propOrder = {
        "id",
        "name",
        "age"
})
public class StudentInfo {
    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected Long id;
    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected String name;
    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
