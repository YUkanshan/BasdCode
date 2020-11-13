package com.itheima;

import java.util.Scanner;

public class Demo {
    /*
    给定一个整数数组 nums?和一个目标值 target，请你
    在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
   你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
       示例:
       给定 nums = [2, 7, 11, 15], target = 9
       因为 nums[0] + nums[1] = 2 + 7 = 9
       所以返回 [0, 1]
     */
    public static void main(String[] args) {
        System.out.println("请输入数组");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        int target = 9;
        int[] arr5 = method(num, target);
        System.out.println("以下为返回的数组");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]);
            System.out.print(" ");
        }
    }
//定义方法
    public static int[] method(int[] num, int target) {
        //定义最后返回的数组
        int[] arr4 = new int[1];
        //第一个循环,取一个i,在加下来的第二个循环当中,让i和j相加
        for (int i = 0; i < num.length; i++) {
            int arr = num[i];
            //第二个循环,当i为0时,j比i加1,这样就让I和后面的每一个数都相加一次
            for (int j = i + 1; j < num.length; j++) {
                int arr2 = num[j];
                if (arr + arr2 == target) {
                    int[] arr3 = {i, j};
                    arr4 = arr3;
                }
            }
        }
        return arr4;
    }
}


