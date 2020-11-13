package com.itheima.work;

import java.util.Scanner;

public class Work05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.print("请输入第二个整数: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.print("请输入第三个整数: ");
        int num3 = sc.nextInt();
        System.out.print("从大到小的顺序为: ");
        method(num1, num2, num3);
    }

    public static void method(int a, int b, int c) {
        int[] arr = {a, b, c};
        int max1 = a > b ? a : b;
        int max = max1 > c ? max1 : c;
        int min1 = a < b ? a : b;
        int min = min1 < c ? min1 : c;
        int mid = a + b + c - max - min;
        arr[0] = max;
        arr[1] = mid;
        arr[2] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


