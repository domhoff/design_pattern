package com.imooc.week_5th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/16
 * @description:
 * 第五周中,第3节, 2-7
 */
public class StringDemo2 {

    public static void main(String[] args) {

        //定义一个字符串" JAVA编程基础 "
        String  str= new  String("JAVA编程基础,我喜欢java编程");

        //查找字符"A"在字符中中第一次出现的位置
        System.out.println("字符\"A\"在字符中中第一次出现的位置  " +str.indexOf("A")); //index值

        //查找字串"编程"在字符串第一次出现的位置
        System.out.println("字串\"编程\"在字符串第一次出现的位置 " + str.indexOf("编程"));

        //查找字符"A"在字符中中最后一次出现的位置
        System.out.println("字符\"A\"在字符中中最后一次出现的位置  " +str.lastIndexOf("A")); //index值

        //查找字符"编程"在字符中中最后一次出现的位置
        System.out.println("字符\"编曲\"程在字符中中最后一次出现的位置  " +str.lastIndexOf("编程")); //index值

        //在字符串index值为8的位置开始,查找字符"编程"在字符中中第一次出现的位置
        System.out.println("在字符串index值为8的位置开始,查找字符\"编程\"在字符中中第一次出现的位置  "
                +str.indexOf("编程",8)); //返回值是从首字符的下标开始计算; 值: 16

    }
}
