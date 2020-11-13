package com.itheima.test01;

import java.util.ArrayList;

/*1:定义一个ClassRoom对象,包含构造方法,提供get/set方法
班级名称,className(String 类型)	班级类型:classType(String 类型)
班级人数:classCount(int 类型)
2.定义测试类ClassTest,完成以下要求：
定义方法，public static ArrayList<User> getClassCount (ArrayList<User> users)，获得班
级人数大于50人，并且班级类型是Java的，添加到新的集合中返回。
在main方法中完成以下功能：创建3个ClassRoom对象并赋值，
并且将ClassRoom对象添加到ArrayList<ClassRoom>集合中，
调用getClassCount方法并接收，遍历返回的新集合输出新集合中所有元素信息*/
public class Test {
    public static void main(String[] args) {
        ClassRoom cl1 = new ClassRoom("一班","Java",50);
        ClassRoom cl2=new ClassRoom("二班","C",60);
        ClassRoom cl3=new ClassRoom("三班","前端",55);
        ArrayList<ClassRoom> classRoom = new ArrayList();
        classRoom.add(cl1);
        classRoom.add(cl2);
        classRoom.add(cl3);
ArrayList<ClassRoom> newClassRoom=getClassCount(classRoom);
//打印新的集合
        for (int i = 0; i < newClassRoom.size(); i++) {
            ClassRoom cl =  newClassRoom.get(i);
            System.out.println(cl.getClassCount() + cl.getClassType() + cl.getClassName());
        }
    }

    public static ArrayList<ClassRoom> getClassCount(ArrayList<ClassRoom> classRoom) {
        //定义一个新的集合getClassCount
        ArrayList<ClassRoom> ClassRoom=new ArrayList<>();
        //进行遍历判断是否满足条件
        for (int i = 0; i < classRoom.size(); i++) {
            //将集合中的班级对象挨个提取
            ClassRoom cl = classRoom.get(i);
            int classCount = cl.getClassCount();
            String type = cl.getClassType();
            //如果人数大于等于五十并且是Java班
            if(classCount>=50&& type.equals("Java")){
                ClassRoom.add(cl);
            }
        }
        return ClassRoom;
    }

}
