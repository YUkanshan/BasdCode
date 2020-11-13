package com.itheima.work.work02;

class Work02Teacher {
    private String name;//封装姓名
    private int num;//封装工号

    //空参构造
    public Work02Teacher() {

    }

    //姓名的set get
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //工号的set get
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    //带参构造
    public Work02Teacher(String name, int num) {
        this.name = name;
        this.num = num;
    }

    //teach方法
    public void teach() {
        System.out.println("工号为: " + num + "姓名为: " + name + "的老师正在教课");
    }
}

public class Work02TestTeacher {
    public static void main(String[] args) {
        //创造一个无参老师
        Work02Teacher wt01 = new Work02Teacher();
        //输入姓名工号
        wt01.setName("明凯");
        wt01.setNum(777);
        wt01.teach();
        //创造一个有参老师
        Work02Teacher wt02 = new Work02Teacher("暗凯", 4396);
        wt02.teach();

    }
}

