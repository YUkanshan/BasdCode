package com.itheima.object;

public class TestStudent {
    public static void main(String[] args) {

        //定义一个新的学生对象
        Student st = new Student();
        //输入这个学生姓名进封装
        st.setName("张三");
        //输入年龄进封装
        st.setAge(17);
        //打印学生信息
        st.show();

        //同上再次定义一个学生对象
        Student stu = new Student("吴彦祖",45);
        stu.show();
    }

}
