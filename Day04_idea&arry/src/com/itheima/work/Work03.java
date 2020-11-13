package com.itheima.work;

import java.util.Random;

public class Work03 {
    public static void main(String[] args) {
        /*          先定义一个长度为6的整数数组
                    调用random,范围0~100
                    定义遍历,
                    在遍历中调用random随机数,将每个数填入数组中
                    处于简洁,再定义一个for循环完成求和
         */
        Random r = new Random();
        int[] arr = new int[6];
        System.out.println("下面是数组中的所有的数:");
        //使用遍历
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("下面是该数组中所有数的和");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
