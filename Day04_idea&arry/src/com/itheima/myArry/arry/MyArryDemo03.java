package com.itheima.myArry.arry;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyArryDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            arr[i] = sc.nextInt();

        }
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
}
