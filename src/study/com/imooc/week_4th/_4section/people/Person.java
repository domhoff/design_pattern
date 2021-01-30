package com.imooc.week_4th._4section.people;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/9
 * @description: 第4周, 第4节, 2-2
 */
public class Person {    //外部类

    public static int age;


    /**
     * 2-5方法内部类
     * 1.定义在方法内部,作用域也在方法内
     * 2.和方法内部成员使用规则一样,class前面不可以添加public,private,protected,static
     * 3.类中不能包含静态成员
     * 4.类中可以包含final,abstract修饰的成员.
     */
    public Object   getHeart() {   //找不到Heart,用Object代替.
        class Heart {
            public int age = 13;
            int temp = 22;

            public final void say() {
                System.out.println("hello");
            }

            public void eat() {
                System.out.println("Heart_class,人会吃东西");
            }

            public String beat() {
                new Person().eat();
                return Person.age + "岁的心脏在跳动";
            }
        }
        return new Heart().beat();
    }

//        new Heart().temp=12;  //外部类获取内部类信息.
//        temp=33;
//        return  new Heart();
//    }
    public void eat() {
        System.out.println("人会吃东西");
    }
}


/**
 * 成员内部类
 * 1.内部类在外部使用时,无法直接实例化,需要借由外部类信息才能完成实例化
 * 2.内部类的访问修饰符,可以任意,但是访问范围会受到影响.
 * 3.内部类可以直接访问外部类的成员; 如果出现同名属性,优先访问内部类成员中定义的
 * 4.可以使用 外部类.this.成员 的方式,访问外部类中同名的信息.
 * 5.外部类访问内部类信息,需要通过内部类实例,无法直搪访问.  ???
 * 6.内部部编译后.class文件命名: 外部类$内部部.class
 * 7.内部类中是否可以有与外部类相同方法签名的方法?
 * 成员内部类
 * class Heart{        //成员内部类
 * public  int age=13;
 * int temp=22;
 * <p>
 * //public void eat(){};
 * public String beat(){   //内部类方法
 * eat();
 * //            return  age + "岁的心脏在跳动";
 * return  Person.this.age + "岁的心脏在跳动";  //访问当前类成员信息.和内部属性无关系.
 * <p>
 * }
 * }
 * <p>
 * 2-4静态内部类
 * 1.内部类在外部使用时,无法直接实例化,需要借由外部类才能完成实例化.
 * 2.静态内部类对象实例时,可以不依赖外部类对象.
 * 3.可以通过  外部类.内部类.静态成员的方式,访问内部类中的静态成员.相应的访问权限要设置合理.
 * 4.当内部类属性与外部类属性同名时,默认访问的是外部类中的成员.
 * 如果需要访问外部类中的静态属性时,则可以通过: 外部类.属性  的方式访问.
 * 如果需要访问外部类中的非静态属性时,则可以通过: new 外部类().属性  的方式访问.
 * <p>
 * public  static class Heart{        //成员内部类
 * public  int age=13;
 * int temp=22;
 * public static void say(){    //跨包调用时需要加public
 * System.out.println("hello");
 * }
 * public String beat(){   //内部类方法
 * new Person().eat();
 * return new Person().age + "岁的心脏在跳动";    //非静态成员
 * //针对外部类属性成员是否是静态成员,有两种调用方式
 * //如果是非静态的,借助于外部类的实例对象  return new Person().age + "岁的心脏在跳动";
 * //如果是静态成员, 外部类.成员 方式访问  return new Person.age + "岁的心脏在跳动
 * }
 * }
 */

/** 成员内部类
 class Heart{        //成员内部类
 public  int age=13;
 int temp=22;

 //public void eat(){};
 public String beat(){   //内部类方法
 eat();
 //            return  age + "岁的心脏在跳动";
 return  Person.this.age + "岁的心脏在跳动";  //访问当前类成员信息.和内部属性无关系.

 }
 }

 */


/** 2-4静态内部类
 *1.内部类在外部使用时,无法直接实例化,需要借由外部类才能完成实例化.
 * 2.静态内部类对象实例时,可以不依赖外部类对象.
 * 3.可以通过  外部类.内部类.静态成员的方式,访问内部类中的静态成员.相应的访问权限要设置合理.
 * 4.当内部类属性与外部类属性同名时,默认访问的是外部类中的成员.
 * 如果需要访问外部类中的静态属性时,则可以通过: 外部类.属性  的方式访问.
 * 如果需要访问外部类中的非静态属性时,则可以通过: new 外部类().属性  的方式访问.
 */
/**
 public  static class Heart{        //成员内部类
 public  int age=13;
 int temp=22;
 public static void say(){    //跨包调用时需要加public
 System.out.println("hello");
 }
 public String beat(){   //内部类方法
 new Person().eat();
 return new Person().age + "岁的心脏在跳动";    //非静态成员
 //针对外部类属性成员是否是静态成员,有两种调用方式
 //如果是非静态的,借助于外部类的实例对象  return new Person().age + "岁的心脏在跳动";
 //如果是静态成员, 外部类.成员 方式访问  return new Person.age + "岁的心脏在跳动
 }
 }
 */



