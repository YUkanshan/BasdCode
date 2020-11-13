package com.itheima.myArry.arry;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyArryDemo06 {
    public static void main(String[] args) {
        //定义新的五位数组
        int[] arr = new int[5];

        //引用键盘输入
        Scanner sc = new Scanner(System.in);

        //定义一个和sum
        int sum = 0;

        //用for循环来完成五次键盘输入
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "次数据输入");
            int num = sc.nextInt();

            //输入的数字如果小于50或者大于100就不得输入
            if (num < 50 || num > 100) {
                System.out.println("对不起,您输入的数字超过范围请重新输入");
                i--;//这一步的作用便是返回上一步
            } else {
                arr[i] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("和为: " + sum);

    }
}
