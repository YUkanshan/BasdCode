package com.tiheima.idea;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        /*在一次考试当中，小明考了5门学科(这里使用数组存储课程分数)， 小明的分数由老师给定(使用键盘录入给数组进行
                赋值)，求出小明成绩的最高分,最低分,以及平均分(整数即可)
                */
        //先定义一个五位数的数组
        int[] arr = new int[5];

        //定义一个键盘输入
        Scanner sc = new Scanner(System.in);

        //通过遍历让老师将小明的每一组成绩都输入进去
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("老师给定的第一项成绩为: ");
                    break;
                case 1:
                    System.out.println("老师给定的第二项成绩为: ");
                    break;
                case 2:
                    System.out.println("老师给定的第三项成绩为: ");
                    break;
                case 3:
                    System.out.println("老师给定的第四项成绩为: ");
                    break;
                case 4:
                    System.out.println("老师给定的第五项成绩为: ");
                    break;
            }
            int num = sc.nextInt();
            if (num > 0 && num <= 100) {
                arr[i] = num;
            } else {
                System.out.println("老师输入的成绩不合规,请重新输入");
                i--;
            }
        }
        //求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("学生成绩的最大值为: " + max);
        //求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("学生成的最小值为: " + min);
        //求平均值
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int avg = sum / arr.length;
        System.out.println("该学生的平均成绩为: " + avg);
    }
}
