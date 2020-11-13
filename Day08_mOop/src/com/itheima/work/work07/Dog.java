package com.itheima.work.work07;

public class Dog {
    private String color;
    private String breed;
    //定义空参
    public Dog(){
    }
    public Dog(String color,String breed){
        this.color=color;
        this.breed=breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //定义吃的行为
    public void eat(){
        System.out.println(color + "颜色的" + breed + "狗正在啃骨头");
    }
    //定义看家
    public void lookHome(){
        System.out.println(color + "颜色的" + breed + "狗正在看家");
    }
}

