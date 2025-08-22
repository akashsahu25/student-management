package com.akassahu.studentManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data // constructor,getter and setter nai banana pad ta
//@AllArgsConstructor
//@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String gmail;

    public StudentDto() {
    }

    public StudentDto(Long id, String name, String gmail) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
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

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
