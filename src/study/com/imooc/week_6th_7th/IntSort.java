package com.imooc.week_6th_7th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 * 第6-7周. 第1节,2-1
 */
public class IntSort {

    public static void main(String[] args) {
        //对存储在List中的整形数据进行排序

        List<Integer> list = new ArrayList<Integer>(); //泛型,写与基本数据对应的包装类名字
        list.add(5);   // 5自动封装成Integer类型对象
        list.add(9);
        list.add(3);
        list.add(1);

        System.out.println("排序前:  ");
        for(int n:list){
            System.out.print( n+ " ");
        }
        System.out.println();

        //对List中的数据进行排序
        Collections.sort(list);
//        Collections.reverse(list);
        System.out.println("排序后:  ");
        for(int n:list){
            System.out.print( n+ " ");
        }

        /**
        //倒序输出
        System.out.println("\n reverse:  ");
        Collections.reverse(list);
        for(int n:list){
            System.out.print( n+ " ");
        }
         */

    }
}
