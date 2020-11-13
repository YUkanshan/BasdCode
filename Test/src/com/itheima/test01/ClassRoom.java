package com.itheima.test01;

public class ClassRoom {
    private String className;//班级名称
    private String classType;//班级类型
    private int classCount;//班级人数
//构造方法
    public ClassRoom() {

    }
    public ClassRoom(String className, String classType, int classCount) {
        this.className = className;
        this.classType = classType;
        this.classCount = classCount;
    }
//封装set get
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
}
