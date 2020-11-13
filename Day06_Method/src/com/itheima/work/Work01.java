package com.itheima.work;

public class Work01 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};//定义一个数组
        print(arr);//调用方法
    }

    //定义方法
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }

    }
}
