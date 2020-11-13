package com.itheima.domain;

public class Student {
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    String name;
    int age;
    //封装set get


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}