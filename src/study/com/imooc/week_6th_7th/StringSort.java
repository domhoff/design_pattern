package com.imooc.week_6th_7th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 *    第6-7周. 第1节,2-3
 *    对存放在list中的字符串进行排序
 */
public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("blue");
        list.add("yellow");
        list.add("gray");

        System.out.println("排序前:  ");
        for(String s:list){
            System.out.print(s + "  ");
        }

        System.out.println("\n\n排序后:   ");
        Collections.sort(list);
        for(String s:list){
            System.out.print(s + " ");
        }
    }
}
