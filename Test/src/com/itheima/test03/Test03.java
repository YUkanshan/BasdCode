package com.itheima.test03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入字符串");
        String st = sc.nextLine();
        String numSt = new String();
        String wordSt = new String();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)>='0'&&st.charAt(i)<='9'){
                numSt+=st.charAt(i);
            }else if ((st.charAt(i)>='A'&&st.charAt(i)<='Z')||(st.charAt(i)>='a'&&(st.charAt(i)<='z'))){
                wordSt+=st.charAt(i);
            }
        }
        String endSt = numSt+wordSt;
        for (int i = 0; i < endSt.length(); i++) {
            System.out.print(endSt.charAt(i));
        }

    }
}
