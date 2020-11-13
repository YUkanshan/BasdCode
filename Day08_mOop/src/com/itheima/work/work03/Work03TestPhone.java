package com.itheima.work.work03;

class Work03Phone {
    //封装属性
    private String brand;
    private int price;
    private String color;

    //空参定义
    public Work03Phone() {

    }

    //品牌的set get
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //价格的set get
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //颜色的set get
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //带参构造
    public Work03Phone(String brand,int price,String color){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }
    //定义call功能
    public void call(){
        System.out.println("正在使用价格为:" + price + "元的" + brand + "手机打电话");
    }
    //定义发短信功能
    public void sendMessage(){
        System.out.println("正在使用价格为:" + price + "元的" + brand + "手机发短信");
    }
}
public class Work03TestPhone {
    public static void main(String[] args) {
        //定义一个空参手机
        Work03Phone ph01 = new Work03Phone();
        ph01.setBrand("小米");
        ph01.setPrice(1600);
        ph01.setColor("白金");
        //定义一个带参手机
        Work03Phone ph02 = new Work03Phone("华为",6666,"黑色");
        ph01.call();
        ph01.sendMessage();
        System.out.println("-------------------------");
        ph02.call();
        ph02.sendMessage();
    }
}