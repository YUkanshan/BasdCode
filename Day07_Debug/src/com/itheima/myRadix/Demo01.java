package com.itheima.myRadix;

public class Demo01 {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        int start = 0;
        int end = arr.length - 1;
        for (; start != end; start++, end--) {
            if (end == start) {
                break;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
