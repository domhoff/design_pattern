package com.imooc.week_6th_7th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 *
 * Cat拷贝自: week_5th\set\Cat.java
 * 第6-7周,第1节,3-3
 */
public class Cat {

    private  String name;
    private  int month;
    private  String  species;


    //构造方法
    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    @Override
    public String toString() {
        return "[" +
                "名字:" + name +" ," +
                "年齡:" + month + " ," +
                "品种:" + species +
                "]";
    }

}
