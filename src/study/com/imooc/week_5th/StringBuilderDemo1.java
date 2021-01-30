package com.imooc.week_5th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/16
 * @description:
 *  第5周, 第3节,3-3
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {

        //定义一个字符串
        StringBuilder str = new StringBuilder("你好");
        //在"你好"后添添加内容
//        str.append(",");
//        str.append("imooc!");
        System.out.println("str=: " + str.append(",").append("imooc!"));

        //将符串这成"你好,iMOOC!";方式1
        System.out.println("删除后: " + str.delete(4, 8).insert(4, "IMOOC"));

        //方式2,替换
        System.out.println("删除后: " + str.replace(4, 8, "IMOOc"));


        //方式2,替换
        System.out.println("删除后: " + str.replace(4, 8, "IMOOc"));


        //在字符串"你好,iMOOc"中取出"你好",并输出
        System.out.println("取出后: " + str.substring(0, 2));
    }




}
