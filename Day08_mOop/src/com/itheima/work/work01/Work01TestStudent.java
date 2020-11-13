package com.itheima.work.work01;

import com.itheima.object.Student;

class Work01Student {
    private String name;//封装姓名成员变量
    private int age;//封装年龄成员变量

    //编写空参构造方法
    public Work01Student() {

    }

    ;

    //编写带参构造方法
    public Work01Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ;

    //姓名的get set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //年龄的gst set
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    //show方法
    public void show(){
        System.out.println("姓名为: "+this.name+"   "+"年龄为: "+this.age);
    }
}
public class Work01TestStudent {
    public static void main(String[] args) {
        //创造一个无参学生
        Student st1 = new Student();
        st1.setName("吴彦祖");
        st1.setAge(17);
        System.out.println("这是一个无参构造方法的学生");
        st1.show();

        //创造一个带参学生
        Student st2 = new Student("彭于晏",18);
        System.out.println("这是一个带参构造方法的学生");
        st2.show();
    }
}

