package com.example.soapservices.output;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "GetStudentRequest", namespace = "https://example.ac.rw/soap/students")
public class GetStudentRequest {
    @XmlElement(namespace = "https://example.ac.rw/soap/students",required = true)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
