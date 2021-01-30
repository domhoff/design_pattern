package com.imooc.week_4th._4section.anonymous;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/10
 * @description: 第4节, 匿名内部类
 */
public abstract class Person {
    private   String name;

    public Person() {
    }  //无参构造

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read(); //抽象方法,没有方法体.
}
