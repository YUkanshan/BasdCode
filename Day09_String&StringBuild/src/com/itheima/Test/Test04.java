package com.itheima.Test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String phone = sc.nextLine();
        //截取前三位
        String start = phone.substring(0,3);
        //截取后四位
        String end =phone.substring(phone.length()-4);
        System.out.println(start + "****" + end);
    }
}
