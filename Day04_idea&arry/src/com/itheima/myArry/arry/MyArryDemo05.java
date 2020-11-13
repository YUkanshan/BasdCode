package com.itheima.myArry.arry;

public class MyArryDemo05 {
    public static void main(String[] args) {
        //定义一个五个数字的数组
        int[] arr = {33, -15, 29, -87, 99};

        //定义最大值
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {

            //用for循环来将Max与每个数组里面的值进行比较
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组最大值为: " + max);

    }
}
