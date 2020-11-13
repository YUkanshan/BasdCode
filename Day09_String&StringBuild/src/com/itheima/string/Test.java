package com.itheima.string;

public class Test {
    public static void main(String[] args) {

        String s1 = new String("abc");
        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);
        String s3 = new String(ch);
        String s4 = "abc";
        String s5 = "abc";
        System.out.println(s1 == s2);

    }
}
