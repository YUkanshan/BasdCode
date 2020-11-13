package com.itheima.method;

import java.util.Scanner;

public class MyMethod05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        dayin(num);
    }
    public static void dayin(int num ){
        for (int i = 0; i < num; i++) {
            System.out.println("打印这个内容");
        }

    }
}
