package com.javaboy.pojo;

import com.javaboy.controller.ValidationGroup1;
import com.javaboy.controller.ValidationGroup2;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student2 {
    @NotNull(message = "{student2.id.notnull}", groups = ValidationGroup1.class)
    private Integer id;
    @NotNull(message = "{student2.name.notnull}", groups = {ValidationGroup1.class,  ValidationGroup2.class})
    @Size(min = 2, max = 10, message = "{student2.name.length}", groups = {ValidationGroup1.class,  ValidationGroup2.class})
    private String name;
    @Email(message = "{student2.email.error}", groups = {ValidationGroup1.class,  ValidationGroup2.class})
    private String email;
    @Max(value = 150, message = "{student2.age.error}", groups = ValidationGroup2.class)
    private Integer age;

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
