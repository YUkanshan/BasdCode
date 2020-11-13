package com.itheima.work.work05;

public class Test {
    public static void main(String[] args) {

        //定义一个项目精力
        Manager ma = new Manager("马化腾", 777, 8000, 2000);
        Coder co = new Coder("吴啸宇", 888, 6000, 2000);
        //让项目经理工资
        ma.work();
        //让吴彦祖工作
        co.work();
    }
}