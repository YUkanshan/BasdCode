package com.itheima.object;

public class Student {
    private String name;
    private int age;

    //无参构造
    public Student() {
        System.out.println("无参构造被执行了");
    }

    //编写一个定义对象时直接赋值名字和年龄的有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //将年龄封装设置进来
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误");
        }
    }

    //获取年龄
    public int getAge() {
        return this.age;
    }

    //将姓名封装输入
    public void setName(String name) {
        this.name = name;
    }

    //将姓名获取进getName
    public String getName() {
        return this.name;
    }

    //定义一个show方法来查看定义的对象数值设置是否成功
    public void show() {
        System.out.println("姓名为: " + this.name + "   " + "年龄为: " + this.age);
    }
}
