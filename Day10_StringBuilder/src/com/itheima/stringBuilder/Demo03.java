package com.itheima.stringBuilder;

public class Demo03 {
    public static void main(String[] args) {
       int[] i = new int[3];
       i[1]=3;
       i[2]=4;
       int[] j =i;
       j[1]=33;
        System.out.println(i[0]);
    }
    }

