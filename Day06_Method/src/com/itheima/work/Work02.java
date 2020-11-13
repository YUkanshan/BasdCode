package com.itheima.work;

public class Work02 {
    public static void main(String[] args) {
        System.out.println(max(3, 4));
        System.out.println(max(3, 4, 5));
    }

    //定义比两个值的方法
    public static int max(int num1, int num2) {
        int num3 = num1 > num2 ? num1 : num2;
        return num3;
    }

    //定义三个值的最大值的方法
    public static int max(int num1, int num2, int num3) {
        int max1 = num1 > num2 ? num1 : num2;
        int max2 = num2 > num3 ? num2 : num3;
        return max2;
    }
}