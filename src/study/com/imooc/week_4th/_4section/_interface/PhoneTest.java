package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description:
 *
 *第4周,第4节. 接口
 */

public class PhoneTest {
    public static void main(String[] args) {

        FourPhone phone = new FourPhone();
        phone.call();
        phone.message();
        phone.vedio();
        phone.music();
        phone.photo();
        phone.netword();

        System.out.println("==============================");

        //自定义拍照功能
        IPhoto ip= new FourPhone();
        ip.photo();
        ip=new Camera();
        ip.photo();

        System.out.println("=========================");
        System.out.println(INet.TEMP);  //通常访问接口常量方式,直接用接口文访问常量

        INet net=new SmartWatch();  //接口引用指向实现类.  ***??
        System.out.println(net.TEMP); //如要实现类中有与接口中同名常量,输出的是接口中定义的常量,TEMP=20;
                                      //net只能调用在SmartWatch实现接口的方法,即@Overide重写的方法.不能调用SmartWatch本身的方法
        net.connection(); //接口default,接口中方法默认带方法体
        INet.stop();  //需要用接口名去调用.接口static:静态方法,可以带方法体

        SmartWatch sw=new SmartWatch();
        System.out.println(sw.TEMP); //输出的是实现类中定义的常量.TEMP=30

        System.out.println("\n------------------------");
        INet cp= new Compute();
        cp.connection();

        INet net2=new SmartWatch();
        net2.connection();




    }
}
