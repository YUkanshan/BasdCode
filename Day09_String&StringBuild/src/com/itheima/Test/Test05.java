package com.itheima.Test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s1 = sc.nextLine();
        String result = s1.replace("妈","马");
      String re= result.replace("死","暴毙");
        System.out.println(re);
    }
}
