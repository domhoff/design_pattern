package com.imooc.week_5th.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/19
 * @description:
 * 第5周.第4节, 3-4
 */
public class WordDemo {

    public static void main(String[] args) {

        //将英文单词添加到HashSet
        Set set = new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");

        //显示集合内容
        System.out.println("集合中的元素为: ");
        Iterator it = set.iterator();
        //遍历迭代器并输出元素
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //在集合中插入新的单词
//        set.add("green");
        set.remove("white");
        set.add("white");  //重复元素
        it = set.iterator();
        System.out.println("\n在集合中插入新的单词: ");
        //遍历迭代器并输出元素
        while(it.hasNext()){
            System.out.print(it.next() + " " + "\n");
        }
    }


}
