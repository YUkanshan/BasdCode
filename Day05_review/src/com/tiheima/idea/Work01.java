package com.tiheima.idea;

import java.util.Random;

public class Work01 {
    public static void main(String[] args) {
        /*小明的支付宝中有30个好友在玩蚂蚁森林,这30人的每日生成的能量以随机数产生(随机数的范围[0,100]),小明是个有
        原则的人 ,5以下的能量会放过. 问小明今日可以偷走多少能量?(不考虑偷不走的情况)*/
        int[] arr = new int[30];//定义30人的数组
        Random r = new Random();//定义一个随机数
        int sum = 0;//定义所有数组数中的和

        //使用一个遍历让所有人的能量进行相加
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            //判定条件,低于5的能量不偷
            if (arr[i] > 5) {
                sum += arr[i];
            }

        }
        System.out.println("小明今天可以偷走的能量为: " + sum);
        ;
    }
}
