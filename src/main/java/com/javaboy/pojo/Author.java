package com.javaboy.pojo;

public class Author {
    private String name;
    private String age;
    private String favorite;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", favorite='" + favorite + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
