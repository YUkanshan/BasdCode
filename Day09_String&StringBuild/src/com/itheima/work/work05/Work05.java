package com.itheima.work.work05;

import java.util.Scanner;

/*我国的居民身份证号码，
由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，
并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，
最后一位可以是数字或者大写字母X。
 */
public class Work05 {
    public static void main(String[] args) {
        System.out.println("请输入身份证号");
        Scanner sc = new Scanner(System.in);
        String password=sc.nextLine();
        char[] arr = password.toCharArray();
        //身份证号码位数不是18位
        if(arr.length!=18){
            System.out.println("对不起,您输入的身份证号码有误");
        }else if(arr[0]=='0') {//身份证头位数
            System.out.println("对不起身份证头位数字不能是0");
        }else {
            for (int i = 0; i < arr.length; i++) {

              if (i < 17){
                 /* if(arr[i]>'A'&&arr[i]<'z') {
                      System.out.println("对不起,身份证前17位只能是数字");
                      break;
                  }else*/
                      //判定号码前17位是否是数字
                    if(arr[i]<'0'||arr[i]>'9'){
                        System.out.println("对不起身份证号码前十七位必须是数字");
                        break;
                    }
                }else{//判定最后一位是否是X或者是数字
                    if(arr[i]=='X'||(arr[i]>='0'&&arr[i]<='9')){
                        System.out.println("您好,该身份证号合法");
                    }
                }

            }
        }
    }
}
