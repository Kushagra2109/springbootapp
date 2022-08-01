package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student20IT059 { // POJO class or Bean Class
    @Id
    private Integer id;
    private String firstName;

    public Student20IT059() {
    }

    public Student20IT059( Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Integer   getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
