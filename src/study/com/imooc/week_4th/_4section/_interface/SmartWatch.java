package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description:
 */
public class SmartWatch implements INet, IPhoto {
    public static  final  int TEMP=30;

//    public void call(){}{ System.out.println("智能手表可以打电话"); } //多写符号{}
    public void call(){ System.out.println("智能手表可以打电话"); }
    public void message(){ System.out.println("智能手表可以发短信"); }

    //实现类中普通方法与接口抽象方法同名时,在实现类中不用实现该方法.
    public void network(){ System.out.println("智能手表可以上网"); }



    @Override
    public void photo() {
    }

    @Override
    public void connection() {
//        INet.super.connection(); //调用接口中默认的方法.super,调用接口中默认成成员.
//        INet.stop();   // 省略super,INet调用的是接口中静态成员:TEMP,stop.
        System.out.println(" SmartWatch中的connection");
    }


}

