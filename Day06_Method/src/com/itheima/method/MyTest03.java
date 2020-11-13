package com.itheima.method;

import java.util.Random;

public class MyTest03 {
    public static void main(String[] args) {
        int[] arr = {100, 500, 800, 300};
        money(arr);
    }
    public static void money(int arr[]) {
        Random r = new Random();
        int count = 0;
        while (true) {
            int num = r.nextInt(arr.length);
            if (arr[num] > 0) {
                System.out.println("恭喜您抽到了" + arr[num] + "元");
                count++;
                arr[num] = 0;
            } else {
                System.out.println("对不起,您未中奖");
            }
            if (count == arr.length) {
                break;
            }
        }
    }
}
