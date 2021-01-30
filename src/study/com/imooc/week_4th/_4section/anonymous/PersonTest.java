package com.imooc.week_4th._4section.anonymous;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/10
 * @description:
 */
public class PersonTest {

/**根据传入的不同人的类型,调用对应的read方法
 * 方案1
 */
/**
    public  void getRead(Man man){
        man.read();
    }
    public  void getRead(Woman womman){
        womman.read();
    }  */

    /**
     * 方案2
     */
    public void getRead(Person person){
        person.read();

    }


/**
    public static void main(String[] args) {
        PersonTest test =  new PersonTest();
        Man one=new Man();
        Woman wto=new Woman();
        test.getRead(one);
        test.getRead(wto);
    } */


public static void main(String[] args) {
    PersonTest test =  new PersonTest();
//    Man one=new Man();
//    Woman wto=new Woman();
//    test.getRead(one);
//    test.getRead(wto);

    /**方案3 匿名内部类
    *匿名类代替子类去实现抽象类实例化,即不需要在子类中实现抽象类的抽象方法
     * 在实例对象的同时,完成对于对象内容的编写.
     * 优点: 方案2中, Man,Woman两个类在整个程序运行中只使用一次,以后不再使用.
     * 弊端: 当下次重复调用时,需要重写.
     * 1.匿名内部类没有类型名称,实例对象名称.
     * 2.编译后的文件名:  外部类$数字.class
     * 3.无法使用private,public,protected,abstract修饰
     *4.无法编写构造方法 ;如果属性进行初始化操作,可用代码块解决.
     * 5.匿名内部类不能出现静态成员.
     * 6.匿名内部类可实现接口或继承父类,二选一.
     */
    test.getRead(
            new Person(){
                @Override
                public void read() {
                    System.out.println("男生喜欢看科幻书藉");
                }
            });

    test.getRead(new Person() {
        @Override
        public void read() {
            System.out.println("女生喜欢读言情小说");
        }
    });

}


}

