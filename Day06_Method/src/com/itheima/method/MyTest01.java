package com.itheima.method;

public class MyTest01 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        arry(arr);
    }
    public static void  arry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
        System.out.println();
    }
}
