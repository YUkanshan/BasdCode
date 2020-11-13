package com.itheima.work.work04;

import java.util.Scanner;

/*          请编写程序，由键盘录入一个字符串，
            统计字符串中英文字母和数字分别有多少个。
            比如：Hello12345World中字母：10个，数字：5个。
            */
public class Work04 {
    public static void main(String[] args) {
        //调用Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String st = sc.nextLine();
        //计数器
        int wordcount =0;
        int mathcount=0;
        //遍历输入的字符串并在中间嵌套if,来判定英文字母和数字的个数
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)>='A'&&st.charAt(i)<='z'){
                wordcount++;
            }else   if (st.charAt(i)>='0'&&st.charAt(i)<='9'){
                mathcount++;
            }
        }
        System.out.println("该字符串中字母的个数为: " + wordcount);
        System.out.println("该字符串中数字的个数为: " + mathcount);
    }
}
