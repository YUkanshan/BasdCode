package com.itheima.Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String username = "admin";
        String password="12345";
        Scanner sc = new Scanner(System.in);
        //三次循环
        for (int i = 2;i>0;i--){
            System.out.println("请输入账号");
            String setname = sc.nextLine();
            System.out.println("请输入密码");
            String setpassword = sc.nextLine();
            if (setname.equals(username)&&setpassword.equals(password)) {
                System.out.println("您的账号密码输入正确");
                break;
            }else{
                if(i==0){
                    System.out.println("对不起,您今日的次数已用完,请明日再来");
                }else{
                    System.out.println("登录失败,您今日还剩" + i + "次输入机会");
                }
            }
        }
    }
}
