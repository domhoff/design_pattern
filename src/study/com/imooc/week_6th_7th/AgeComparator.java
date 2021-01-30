package com.imooc.week_6th_7th;

import java.util.Comparator;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 *  第6-7周. 第1节, 3-4
 */
public class AgeComparator implements Comparator<Cat> {


    @Override
    public int compare(Cat o1, Cat o2) {
        //接年齡降序排序
        int age1=o1.getMonth();
        int age2=o2.getMonth();
        return age2-age1;
    }
}

