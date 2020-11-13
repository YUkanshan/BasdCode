package com.itheima.test;

import com.itheima.domain.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        //主页菜单
        lo:
        while ((true)) {
            System.out.println("--------欢迎来到学生管理系统-------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch ((choice)) {
                case "1"://添加学生
                    addStudent(list);
                    break;
                case "2"://删除学生
                    querryStudent(list);
                    break;
                case "3"://修改学生
                    setStudent(list );
                    break;
                case "4"://查看学生
                    querryStudent(list);
                    break;
                case "5"://结束
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("您输入有误");
                    break;
            }
        }
    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //给出录入提示信息,让用户分步骤录入学生对象相关信息
        System.out.println("请输入学号");
        String sid = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String brithday = sc.next();
        //将键盘录入的信息封装成学生对象
        Student stu = new Student(name, sid, age, brithday);
        list.add(stu);
        System.out.println("添加成功");

    }

    //查看学生方法
    public static void querryStudent(ArrayList<Student> list) {
        //判断集合中是否存在数据,如果不存在直接给出提示
        if (list.size() == 0) {
            System.out.println("无信息,请添加后重新查询");
            return;
        }
        //如果存在,先展示表头
        System.out.println("学号\t\t姓名\t年龄\t生日");
        //遍历集合,获取每一个学生对象的信息,并进行打印
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "岁\t" + stu.getBirthday());
            ;

        }
    }

    //输入要查找的集合(也就是本次管理系统唯一用到的集合list,
// 以及输入要查找的学号,如果查找到的话,就返相同的学号所在的索引
    public static int getIndex(ArrayList<Student> list, String sid) {
        //先假设传入的学号不存在,标记为思想
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if (sid.equals(id)) {
                index = i;
                break;
            }

        }
        return index;
    }


    //删除学生方法
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入您要删除的学生学号");
        //键盘接受需要删除的学生学号
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        //将键盘接受来的学生学号导入进之前的索引查找方法中,并导出学号所在的索引
        int index = getIndex(list, deleteSid);
        if (index == -1) {
            System.out.println("查无信息,请重新输入");
        } else {
            list.remove(index);
            System.out.println("删除成功");
        }

    }

    //修改学生方法
    public static void setStudent(ArrayList<Student> list) {
        System.out.println("请输入您要修改的学生学号");
        //键盘接受需要删除的学生学号
        Scanner sc = new Scanner(System.in);
        String setSid = sc.next();
        //将键盘接受来的学生学号导入进之前的索引查找方法中,并导出学号所在的索引
        int index = getIndex(list, setSid);
        if (index == -1) {
            System.out.println("查无信息,请重新输入");
        } else {
            System.out.println("请输入新的姓名");
            String newName = sc.next();
            System.out.println("请输入新的年龄");
            int newAge = sc.nextInt();
            System.out.println("请输入新的生日");
            String newBrithday = sc.next();
            Student stu = list.get(index);
            stu.setName(newName);
            stu.setAge(newAge);
            stu.setBirthday(newBrithday);
            System.out.println("修改成功");

        }

    }
}