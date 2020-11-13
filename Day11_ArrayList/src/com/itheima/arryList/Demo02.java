package com.itheima.arryList;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(3, "444");
        System.out.println(list);
    }
}
