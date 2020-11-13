package com.itheima.work.work05;

 class Manager {
    //封装项目经理属性
    private String name;
    private int id;
    private int salary;
    private int bonus;
//定义姓名set get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//定义ID的set get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//定义工资的set和get
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//定义奖金的set和get
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    //定义一个空参
    public Manager(){

    }
    //定义一个带参构造
    public  Manager(String name,int id,int salary,int bonus){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.bonus=bonus;
    }
    //定义工作行为
    public void work(){
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + ",奖金为" + this.bonus + "的项目经理正在努力的做着管理工作,分配工作");
    }
}

