package com.example.soapservices.general.domain;

import com.example.soapservices.general.dto.SaveStudentDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

    public Student() {
    }
    public Student(SaveStudentDTO dto){
        this.age =dto.getAge();
        this.name = dto.getName();
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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
}
