package com.itheima.work;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr={11, 22, 33, 44, 55, 66};
        System.out.println("下面是为调换的数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        method(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组已调换: "+arr[i]);
        }
    }
    public static void method(int[] arr){
        System.out.println("请输入想要调换的两个索引");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int index1=sc1.nextInt();
        int index2=sc2.nextInt();
        int num1 = arr[index1];
        int num2 = arr[index2];
        arr[index2]=num1;
        arr[index1]= num2;

    }
}
