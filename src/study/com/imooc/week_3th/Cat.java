package com.imooc.week_3th;


/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/8
 * @description:
 *
 * 第3周, 第1节 Java面向对象/3-1 课程总结
 *
 *java成员属性默认是有初始值的,对象类型为null,int类型为0.
 *局部变量,默认未赋初始值,不能直使用.
 */
public class Cat {
        String name;
        int month;

        public Cat(){
            System.out.println("我是无参构造");
        }


        public Cat(String name){
        this();
            this.name=name;   //只能放在第一行; 调用无参构造器.
            System.out.println("我是单参构造");
        }

        public  void run(){
            String myName="ccc";
            System.out.println(myName);
            System.out.println(name);
            System.out.println(month);
        }

        public static void main(String[] args) {
            Cat pp = new Cat("aaa"); //可调用单参构造器
//            Cat pp = new Cat(); //可调用无参构造器
            pp.run();
        }
    }
