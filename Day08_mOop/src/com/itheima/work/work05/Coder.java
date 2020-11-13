package com.itheima.work.work05;

 class Coder {
    private String name;
    private int id;
    private int salary;
    private int bonus;
//姓名的set get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//id的set get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//工资的set get
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//奖金的set get
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    //定义一个空参
    public Coder(){

    }
    //定义一个带参
    public Coder(String name,int id,int salary,int bonus){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.bonus=bonus;
    }
    //定义一个行为
    public void work(){
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + ",奖金为" + this.bonus + "的程序员正在努力的写着代码");
    }
}

