package com.imooc.week_5th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/16
 * @description:  第5周, 2-10
 * 字符串和byte数据之间的相互转换
 */
public class StrignDemo3 {
    public static void main(String[] args) {

        //字符串和byte数据之间的相互转换

        String str = new String("JAVA 编程 基础"); //空格ascii码码:32,便于区分中文二制编码.
        byte[] arrs = str.getBytes();
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+ " ");
        }

        System.out.println();
        //将byte数组转换为字符串
        String str1 = new String(arrs);
        System.out.println(str1);




    }
}
