package com.itheima.stringBuilder;

public class Demo01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        String st = "";
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println(sb1);

    }
}
