package com.itheima.work;

public class Work06 {
    public static void main(String[] args) {
        //各只股票的收益分别是百分之:
        // 10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int count1 = 0;//定义一个赚钱时的计数器
        int count2 = 0;//定义一个赔钱时的计数器
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count1++;
            } else if (arr[i] < 0) {
                count2++;
            }

        }
        System.out.println("赚钱的股票一共有: " + count1 + "支");
        System.out.println("赔钱的股票一共有: " + count2 + "支");
    }
}
