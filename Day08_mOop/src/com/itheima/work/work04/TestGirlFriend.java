package com.itheima.work.work04;

 class GirlFriend {
    private String name;
    private int heigth;
    private int weigth;
    //定义一个带参构造
    public GirlFriend(){

    }
    public GirlFriend(String name,int heigth,int weigth){
        this.name=name;
        this.heigth=heigth;
        this.weigth=weigth;
    }
    //编写洗衣服功能
    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    //编写做饭功能
    private void cook(){
        System.out.println("女朋友帮我做饭");
    }
    //定义一个show方法
    public void show() {
        System.out.println("我的女朋友叫" + this.name + ",身高为" + this.heigth + ",体重为" + this.weigth + "斤");
    }
}
public class TestGirlFriend {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend("桥本环奈", 155, 90);
        gf.show();
    }
}

