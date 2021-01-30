package com.imooc.week_5th.set;


import java.util.ArrayList;
import java.util.List;


/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/18
 * @description:
 * 第5周,第4节. 2-2
 */
public class ListDemo1 {

    public static void main(String[] args) {

        //用ArrayList存储编程语言的名称,并输出
        List list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("swift");
        System.out.println("列表中元素的个数是: " + list.size());
        System.out.println("\n");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ,");
        }

        /**
         //iterator
         for(Iterator i = list.iterator();i.hasNext();){
         System.out.println(i.next());
         }
         */

        //移除元素
        System.out.println("---------------------------");
//        list.remove(2);
        list.remove("C");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ,");
        }
    }
}
