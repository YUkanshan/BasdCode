package com.itheima.method;

public class MyParam {
    public static void main(String[] args) {
        int a = 100;
        change(a);
        System.out.println(a);
    }
    public static void change(int num){
        num += 1;
        System.out.println(num);
    }
}
