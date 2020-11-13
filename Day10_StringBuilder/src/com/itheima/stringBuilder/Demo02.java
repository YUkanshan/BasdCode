package com.itheima.stringBuilder;

public class Demo02 {
    public static void main(String[] args) {
        Long start =System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("我");
        sb.append("是").append("吴彦祖");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
        Long end = System.currentTimeMillis();
        System.out.println("计算时间为:"+(end - start));
    }
}
