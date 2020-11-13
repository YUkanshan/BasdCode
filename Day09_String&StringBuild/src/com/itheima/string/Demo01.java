package com.itheima.string;

public class Demo01 {
    public static void main(String[] args) {
        char[] ch = {'我','是','吴','彦','祖'};
        String s1 = new String(ch);
        System.out.println("输出构造方法一" + s1);
        String s2 = new String("我也是吴彦祖");
        System.out.println("输出构造方法二" + s2);
    }
}
