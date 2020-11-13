package com.itheima.test02;

import java.util.Scanner;

/*模拟注册用户，按照以下要求实现相关功能：
    a. 提示用户在控制台输入手机号码，并接收。
    b. 判断该手机号码是否是11位，是否都是数字，其余可以不做判断，如果不符合任意一项，则提示用户“注册用户失败”。
c. 将手机号的后四位获取出来输出到控制台上。
*/
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入手机号码");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.length() != 11) {
            System.out.println("注册用户失败");
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                System.out.println("注册用户失败");
                return;
            }
        }
        System.out.println("注册成功");
        String newNum=num.substring(num.length()-4);
       // for (int i = 0; i < newNum.length(); i++) {
         //   System.out.print(newNum.charAt(i));
       // }
      char[] ch = newNum.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

    }
}

