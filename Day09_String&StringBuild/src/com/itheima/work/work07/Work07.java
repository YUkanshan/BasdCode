package com.itheima.work.work07;

/*
定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
调用该方法，并在控制台输出结果。
要求： ​ 1、如果传递的参数为空，返回null ​
2、如果传递的数组元素个数为0，返回[] ​
3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class Work07 {
    public static void main(String[] args) {
        //定义一个Int数组
        int[] arr = {1, 2, 3};
        System.out.println(arrToString(arr));

    }
    //定义拼接方法,返回一个String类型
    public static String arrToString(int[] arr){
        //定义一个SB对象st
        StringBuilder st = new StringBuilder();
        st.append("[");
        //判定arr为Null时
        if(arr ==null){
            return null;
        }
        //当arr不为null时,进行遍历
        for (int i = 0; i < arr.length ; i++) {
            if(i == arr.length-1){//当遍历到最后一个数时
                return st.append(arr[i]).append("]").toString();
            }else{//当遍历到不是最后一个数时
                st.append(arr[i]+",");
            }
        }
        //返回st
        return st.toString();
    }
}
