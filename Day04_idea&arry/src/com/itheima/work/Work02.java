package com.itheima.work;

public class Work02 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        //定义最小值min
        double min = arr[0];

        //用遍历方法让min对数组中每个数都进行比较
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);//输出最小值min

    }
}
