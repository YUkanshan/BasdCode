package com.itheima.Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入柳岩");
        String s1 = sc.nextLine();
        String liu = s1.substring(6,8);
        System.out.println("柳岩截取出来了: " + liu);
    }
}
