package com.itheima.method;

public class MyMethod03 {
    public static void main(String[] args) {
        print(20, 50);
    }

    public static void print(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
    }
}
