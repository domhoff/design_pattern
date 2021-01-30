package com.imooc.week_4th._3section;

/**
 * 第4周,第3节
 *
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/5
 * @description:
 */
public  class Animal__ {
    //属性
    private String name;
    private int month;

    //无参构造方法
    public Animal__() {

    }

    //有参构造方法
    public Animal__(String name, int month) {
        this.name = name;
        this.month = month;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //方法,吃东西
    public  void eat() {
        System.out.println("动物都有吃东西的能力");
    }

    //方法重写,不能用static修饰
    public  static void  say(){
        System.out.println("动物间打招呼");
    }


}
