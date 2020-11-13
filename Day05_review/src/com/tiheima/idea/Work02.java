package com.tiheima.idea;

import java.util.Random;
import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        /*某公司年会，组织抽奖活动，奖品在奖箱中（这里奖箱以数组来表示，数组如下）
         int[] arr = { 3, 1, 2, 4, 0, 0, 0, 5 };
         数组中1代表1等奖，2代表的2等奖...5代表5等奖，0代表未中奖。
         小明随机进行抽取一次，打印对应的奖项，如果抽
         取到0则打印 再接再厉*/
        //定义该数组
        int[] arr={3,1,2,4,0,0,5};
        //输出提示语,让小明开始抽奖
        System.out.println("请按下1开始抽奖");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //用一个死循环来让小明进行输入
        while(true) {
            int ming = sc.nextInt();
            if (ming == 1) {
                System.out.println("开始抽奖");
                int i = r.nextInt(6);
                if(arr[i]==0){
                    System.out.println("请再接再励");
                }else {
                    System.out.println("恭喜小明抽到了: "+arr[i]+"等奖");
                }
                break;
            } else {
                System.out.println("对不起您输入的有误,请重新输入");
            }
        }


    }
}
