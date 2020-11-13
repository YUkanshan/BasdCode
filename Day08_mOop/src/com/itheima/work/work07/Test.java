package com.itheima.work.work07;

public class Test {
    public static void main(String[] args) {
        //定义一只猫
        Cat ca = new Cat("蓝色","暹罗");
        //让猫进行行为
        ca.catchMouse();
        ca.eat();
        //定义一只狗
        Dog dog = new Dog("棕色","德牧");
        //让狗产生行为
        dog.eat();
        dog.lookHome();
    }
}
