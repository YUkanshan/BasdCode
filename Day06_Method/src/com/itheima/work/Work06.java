package com.itheima.work;

import java.util.Scanner;

public class Work06 {
    public static void main(String[] args) {
        System.out.println("请输入数字: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        method(num);
        System.out.println("以下为输入的数字的绝对值: " + method(num));
    }

    public static int method(int i) {
        if (i < 0) {
            i = i-2*i;
        }
        return i;
    }
}
