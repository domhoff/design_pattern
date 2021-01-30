package com.imooc.week_4th._3section;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/5
 * @description:
 */
public class Cat extends Animal__ {
    //属性
    private double weight;

    public Cat() {

    }

    public Cat(String name, int month, double weight) {
        super(name, month);
//        this.setMonth(month);  //与上行等价
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //方法:跑动
    public void run() {
        System.out.println("小猫快乐的奔跑");
    }

    //方法:吃东西,重写父类方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼~~");
    }

    @Override
    public void setMonth(int month) {
        month=333;
        this.setMonth(month);
    }


    public void playBall() {
        System.out.println("小猫喜欢玩线球");
    }


    //方法重写,父类方法,子类方法不能用static修饰
    public  static void say(){
        System.out.println("小猫碰胡须");
    }
}
