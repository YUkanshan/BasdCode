package com.itheima.work;

//记录十个学生的平均成绩{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}
public class Work05 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double arg = sum / arr.length;
        System.out.println("学生们的平均成绩为");
        System.out.println(arg);
    }
}
