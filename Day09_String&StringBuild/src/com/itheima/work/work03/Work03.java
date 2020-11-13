package com.itheima.work.work03;

import java.util.Scanner;

//键盘录入一个字符串，使用程序实现在控制台遍历该字符串。
public class Work03 {
    public static void main(String[] args) {
        //调用Scanner语句
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        //录入字符串
        String st = sc.nextLine();
        //遍历该字符串,其中用到charAt方法,来打印每个索引中的字符
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.charAt(i));
        }
    }
}
