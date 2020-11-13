package com.itheima.method;

public class MyTest02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int[] arr2 = getMaxAndMin(arr);
        System.out.println(arr2[0] + " " + arr2[1]);
    }

    public static int[] getMaxAndMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int maxAndMin[] = {min, max};
        return maxAndMin;
    }
}
