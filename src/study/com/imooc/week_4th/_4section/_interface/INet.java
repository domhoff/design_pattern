package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 *
 * 第四周 第4节
 */
public interface INet {

    /**接口中抽象方法可以不写abstract关键字,
    *访问修饰符默认public
     * 当类实现接口,需要去实现接口类中的所有方法.否则需要将该类设置为抽象类.
     */
    void network();    //实现类中普通方法与接口抽象方法同名时,在实现类中不用实现该方法.
//    void connection();



    //接口中可以定义常量,默认是public static final
    int TEMP=20;


    //jdk1.8中新增;
    // default,接口中方法默认带方法体;可以在实现类中重写,并可以通过接口的引用调用.
    default  void connection(){
        System.out.println("我是接口中的默认链接connection");
    }
//    void connection();

    //static:静态方法,可以带方法体; 不可以在实现类中重写,可以通过接口名调用.
    static  void stop(){
        System.out.println("我是接口中的静态方法\n");
    }

}
