package com.itheima.myRadix;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;//b= a^b^b ==     b =a
        a = a ^ b;//a= a^b^a ==    a= b
        System.out.println(a);
    }
}
