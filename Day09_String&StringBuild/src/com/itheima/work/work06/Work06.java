package com.itheima.work.work06;

import java.util.Random;
import java.util.Scanner;

/*
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，定义方法，
获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，
可包含a-z,A-Z,0-9。例如：
 */
public class Work06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个辉哥说的随机验证码选择库
        String yanzheng = "1234567890abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        String zhen = "";
        //获取四个随机验证码
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(63);
            zhen = zhen + yanzheng.charAt(num);
        }
        //打印验证码
        System.out.println("验证码为: ");
        for (int i = 0; i < zhen.length(); i++) {
            System.out.print(zhen.charAt(i));
        }
        System.out.println();
        //对比验证码
        System.out.println("请输入验证码");
        String user = sc.nextLine();
        if(user.equals(zhen)){
            System.out.println("您的验证码正确");
        }else {
            System.out.println("您输入的验证码错误");
        }
    }
}
