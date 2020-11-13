package com.itheima.work.work01;

import java.util.Scanner;

class Worker {
    private String name;
    private int age;

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


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个工人对象
        Worker wo1 = new Worker();
        System.out.println("请录入工人姓名");
        String name = sc.nextLine();
        wo1.setName(name);
        System.out.println("请录入工人年龄");
        int age = sc.nextInt();
        wo1.setAge(age);

        //打印工人年龄和姓名\
        System.out.println("姓名: " + wo1.getName());
        System.out.println("年龄: " + wo1.getAge());
    }
}
