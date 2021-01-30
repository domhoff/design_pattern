package com.imooc.week_5th.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/19
 * @description: 第5周, 第5节 ,3-9
 */
public class CatTest {
    public static void main(String[] args) {

        //定义宠物猫
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 3, "中华田园猫");

        Set<Cat> set = new HashSet<Cat>();  //必须是Cat的实例对象;使用泛型
        set.add(huahua);
        set.add(fanfan);
        Iterator<Cat> it = set.iterator();  //迭代器加入泛型
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("//迭代器加入泛型");
        }

        //再添加一个与花花属性一们的猫
//        Cat huahua01=new Cat("花花", 12, "英国短毛猫");  //不能添加
        Cat huahua01 = new Cat("花花", 1, "英国短毛猫"); //可以添加
        set.add(huahua01);
        System.out.println("\n再添加一个与花花属性一们的猫");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //重新插入一个新宠物猫   ;3-12
        System.out.println("\n重新插入一个新宠物猫****************");
        Cat huahua02 = new Cat("花花二代", 2, "英国短毛猫");
        set.add(huahua02);
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //在集合中查找花花的信息并输出;通过对象查找   ;3-12
        if (set.contains(huahua)) {
            System.out.println("\n花花找到了");
            System.out.println(huahua);
        } else {
            System.out.println("花花找到了");
        }

        //在集合中通过名称查找; 遍历集合;3-12
        System.out.println("\n在集合中通过名称查找");
        boolean flag = false;
        Cat c = null;
        it = set.iterator();  //上一个迭代器已调用到末尾,需要重新添加迭代器
        while (it.hasNext()) {
            c = it.next();   //得到的是Object对象,强转
            if (c.getName().equals("花花")) {
                flag = true; //找到了
                break;
            }
        }
        if (flag) {
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("花花找没到了");
        }

        //删除花花二代的信息并重新输出
        System.out.println("\n删除花花二代的信息并重新输出");
        for(Cat cat : set) {
            if ("花花二代".equals(cat.getName())) {
                set.remove(cat);
                 break;
            }
        }
        for(Cat cat:set){
        System.out.println(cat);
        }


        //删除集合中的所有宠物猫信息
//        System.out.println("\n删除集合中的所有宠物猫信息");
//        boolean flag1 =  set.removeAll(set);
//        if(flag1){
//            System.out.println("猫都不见了");
//        }else{
//            System.out.println("猫还在");
//        }
//        if(set.isEmpty()){                   //isEmpty判断
//            System.out.println("猫都不见了");
//        }else{
//            System.out.println("猫还在");
//        }

        //多条件删除
        System.out.println("\n多条件删除");
        Set<Cat> set1 = new HashSet<Cat>();
        for(Cat cat: set){
            if(cat.getMonth()<5){
                set1.add(cat);
            }
        }
        for(Cat cat:set1){
            System.out.println(cat);
        }




    }
}
