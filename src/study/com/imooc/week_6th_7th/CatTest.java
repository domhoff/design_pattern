package com.imooc.week_6th_7th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 * 按名字升序排序
 */
public class CatTest {
    public static void main(String[] args) {

        Cat huahua=new Cat("huahua", 5, "英国短毛猫");
        Cat fanfan=new Cat("fanfan", 2, "中华田园猫");
        Cat maomao=new Cat("maomao", 3, "中华田园猫");

        List<Cat> catList = new ArrayList<Cat>();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);

        //排序前
        System.out.println("\n按名字排序前:   ");
        for(Cat cat:catList){
            System.out.println(cat);
        }

        //按名字升序排序后:
        System.out.println("\n按名字排序后:");
        Collections.sort(catList,new NameComparetor());
        for(Cat cat:catList){
            System.out.println(cat);
        }

        //按年齡进行降序排序
        Collections.sort(catList,new AgeComparator());
        System.out.println("\n按年齡进行降序排序:");
        for(Cat cat:catList){
            System.out.println(cat);
        }


    }
}
