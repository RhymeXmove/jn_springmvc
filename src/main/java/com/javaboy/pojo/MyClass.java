package com.javaboy.pojo;

import java.util.List;

public class MyClass {
    private Integer id;
    private List<Student> student;

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
