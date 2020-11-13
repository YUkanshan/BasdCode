package com.itheima.work;

import java.util.Scanner;

public class Work07 {
    public static void main(String[] args) {
        System.out.println("请输入想要四舍五入的数字: ");
        Scanner sc = new Scanner(System.in);
        double   num = sc.nextInt();
        System.out.println(method(num));
    }
    public static double method(double i){
        int a = (int)(i*10)%10;
        if(a>=5){
            return (int)i+1;
        }else{
            return (int)i;
        }
    }
}
