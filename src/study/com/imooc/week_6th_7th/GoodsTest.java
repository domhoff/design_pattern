package com.imooc.week_6th_7th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 * 第6-7周,第1节,4-3
 */
public class GoodsTest {
    public static void main(String[] args) {

        Goods g1 = new Goods("s001", "手机", 2000);
        Goods g2 = new Goods("s002", "冰箱", 5000);
        Goods g3 = new Goods("s001", "电视机", 3000);

        List<Goods> goodsList=new ArrayList<Goods>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);

        //排序前
        System.out.println("排序前:");
        for(Goods goods:goodsList){
            System.out.println(goods);
        }

        Collections.sort(goodsList);
        //排序前
        System.out.println("\n排序后:");
        for(Goods goods:goodsList){
            System.out.println(goods);
        }






    }
}
