package com.itheima.Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要统计的字符串");
        String st = sc.nextLine();
        int bigcount=0;
        int shortcount = 0;
        int numcount=0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(ch>='A'&&ch<='Z'){
                bigcount++;
            }else if(ch>='a'&&ch<='z'){
                shortcount++;
            }else if (ch>='0'&&ch<='9'){
                numcount++;
            }
        }
        System.out.println("有" + bigcount + "个大写字符");
        System.out.println("有" + shortcount + "个小写字符");
        System.out.println("有" + numcount + "个数字字符");
    }
}
