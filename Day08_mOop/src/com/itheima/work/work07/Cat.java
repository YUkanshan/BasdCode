package com.itheima.work.work07;

public class Cat {
    private String color;
    private String breed;
    //定义空参
    public Cat(){
    }
    public Cat(String color,String breed){
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
        System.out.println(color + "颜色的" + breed + "猫正在吃东西");
    }
    //定义抓老鼠
    public void catchMouse(){
        System.out.println(color + "颜色的" + breed + "猫正在抓老鼠");
    }
}
