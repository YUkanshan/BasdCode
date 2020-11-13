package com.itheima.method;

public class MyMethod04 {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(10,20));
        for (int i = 0; i < 5; i++) {
            System.out.println(isEvenNumber(20,30));
        }
    }
    public static int isEvenNumber(int i,int j){
        if(i>j){
            System.out.println(i);
        }else if(i<j){
            System.out.println(j);
        }
        return 1;
    }
}
