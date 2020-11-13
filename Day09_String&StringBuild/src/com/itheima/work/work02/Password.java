package com.itheima.work.work02;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        //定义用户名密码
        String username = "admin";
        String password = "12345";
        //调用Scanner
        Scanner sc = new Scanner(System.in);
        //三次循环来输入账号密码
        for (int i = 2; i >=0; i--) {
            System.out.println("请输入用户名");
            String setname = sc.nextLine();
            System.out.println("请输入密码");
            String setpassword = sc.nextLine();
            //来判定账号密码输入是否正确
            if(setname.equals(username)&&setpassword.equals(password)) {
                System.out.println("您输入的账号密码正确");
                break;
            }else if(i==0){
                System.out.println("您今日三次输入密码机会已用完,请明日再来");
            }else{
                System.out.println("对不起,账号密码输入错误,请重新输入," + "还剩" + i + "次机会");
            }

        }
    }
}
