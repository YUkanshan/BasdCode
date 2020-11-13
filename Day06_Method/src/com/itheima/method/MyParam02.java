package com.itheima.method;

public class MyParam02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void change(int arr[]) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        arr[index] = max - 10;
    }
}
