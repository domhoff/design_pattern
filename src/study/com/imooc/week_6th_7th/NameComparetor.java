package com.imooc.week_6th_7th;

import java.util.Comparator;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 *第6-7周. 第1节, 3-3
 * 比较器;按名字升序排序
 */
public class NameComparetor implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        //按名字升序排离
        String name1 =o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2); //升序排序
//        int n = name2.compareTo(name1); //倒序排序
        return n;
    }
}
