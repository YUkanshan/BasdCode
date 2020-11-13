package com.itheima.arryList;

import java.util.ArrayList;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = null;
        list.add("吴彦祖");
        list.add("彭于晏");
        list.add("pass");
        list.add("余看山");
        list.add("pass");
        for (int i = list.size()-1; i >=0; i--) {
            String st = list.get(i);
            if("pass".equals(st)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
