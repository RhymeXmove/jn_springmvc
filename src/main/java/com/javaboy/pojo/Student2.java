package com.javaboy.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student2 {
    @NotNull(message = "{student2.id.notnull}")
    private Integer id;
    @NotNull(message = "{student2.name.notnull}")
    @Size(min = 2, max = 10, message = "{student2.name.length}")
    private String name;
    @Email(message = "{student2.email.error}")
    private String email;
    @Max(value = 150, message = "{student2.age.error}")
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
