package com.tiheima.idea;

import java.util.Random;

public class Work04 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(32)+1;
            arr[i] = num;
            for(int j = 0; j <i; j++){
                if(arr[i]==arr[j]){
                    i--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
