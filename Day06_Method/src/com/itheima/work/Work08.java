package com.itheima.work;

import java.util.Random;

public class Work08 {
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
                System.out.println(arr[num]+"元的奖金被抽出");
                count++;
                arr[num] = 0;
            } else {
               continue;
            }
            if (count == arr.length) {
                break;
            }
        }
    }
}
