package com.imooc.week_4th._4section.test;

import com.imooc.week_4th._4section.people.Person;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/9
 * @description:
 */
public class PeopleTest {

    public static void main(String[] args) {
        Person lili = new Person();
        lili.age = 12;

        /**
         //获取内部类的对象实例,方式1
         Person.Heart myHeart=new Person().new Heart();
         System.out.println(myHeart.beat());  //0岁的心脏在跳动

         //获取内部类的对象实例,方式2: 外部类对象.new 内部类
         myHeart=lili.new Heart();
         System.out.println(myHeart.beat());

         //获取内部类的对象实例,方式3:  外部类对象.内部类获取方法
         myHeart=lili.getHeart();
         System.out.println(myHeart.beat());
         */


/**
 //获取静态内部对象实例
 Person.Heart myHeart=new Person.Heart();
 System.out.println(myHeart.beat());  //0岁的心脏在跳动


 Person.Heart.say();
 //        lili.Heart.say();   //报错,


 //获取静态内部类的对象实例,方式3:  外部类对象.内部类获取方法
 myHeart=lili.getHeart();
 System.out.println(myHeart.beat());

 */

        System.out.println(lili.getHeart());
    }
}
