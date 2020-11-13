package com.itheima.work.work06;

 class MyRectangle {
    private double heigth;
    private double wide;
    public MyRectangle(){

    }
    //定义一个带参长方形
    public  MyRectangle(double heigth,double wide){
        this.heigth = heigth;
        this.wide = wide;
    }
    //周长
    public double perimeter(){
        return (heigth+wide)*2;
    }
    //面积
    public double area(){
        double area = heigth*wide;
        return area;
    }

}
public class Test {
    public static void main(String[] args) {
        //定义一个长方形
        MyRectangle re = new MyRectangle(10,5);
        re.perimeter();
        System.out.println("该长方形周长为" + re.perimeter());
        re.area();
        System.out.println("该正方形面积为: " + re.area());

    }
}
