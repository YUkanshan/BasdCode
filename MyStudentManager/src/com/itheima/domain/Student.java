package com.itheima.domain;

public class Student {
    private String name;
    private String sid;//学号
    private int age;//年龄
    private String birthday;//生日
    public Student(){


    }
//有参构造
    public Student(String name, String sid, int age, String birthday) {
        this.name = name;
        this.sid = sid;
        this.age = age;
        this.birthday = birthday;//生日
    }
//封装set get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
