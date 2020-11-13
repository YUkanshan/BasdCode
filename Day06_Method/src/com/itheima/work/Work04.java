package com.itheima.work;

import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        System.out.println("请输入行数");
        Scanner sc1 = new Scanner(System.in);
        int  num1 = sc1.nextInt();
        System.out.println("请输入列数");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        for (int i = 0; i < num1; i++) {
            method1(num2);
        }


    }
    public static void method1(int a){
        for (int i = 0; i < a; i++) {
            System.out.print("@");
        }
        System.out.println();
    }
}
