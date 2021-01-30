package com.imooc.week_5th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/16
 * @description:
 * 第五周中,第3节, 2-4
 */
public class StringDemo {

    public static void main(String[] args) {

        //定义一个字符串" JAVA编程基础 "
        String  str= "JAVA 编程 基础";

        //打印输出字符串长度
        System.out.println("字符串的长度是: "  + str.length());

        //取出字符"程"并输出
        System.out.println("取出字符'程':   " +str.charAt(6));

        //取出字串"编程 基础"并输出
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,7));



    }}
