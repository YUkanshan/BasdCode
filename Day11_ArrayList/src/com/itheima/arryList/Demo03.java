package com.itheima.arryList;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("柳岩");
        list.add("杨幂");
        list.add("白百合");
        list.add("周冬雨");
        list.remove("白百合");
        String st = list.get(1);
        System.out.println(st);
    }
}

