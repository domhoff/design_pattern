package com.imooc.week_5th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/14
 * @description:  第5周-第2节
 */
public class WrapperTest {

    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);

        Integer three = 100; //自动装箱操作; 隐式调用Integer.valueOf(100)
        Integer four = 100;
                   //等价于执行了 Integer four = Integer.valueOf(100);
                   //小于127,大于-128
        Integer five= 200;


        System.out.println( one.equals(two));
        System.out.println(one == two);
        System.out.println(three==100);  //自动拆箱
        System.out.println("four==100:  " + (four==100));  //自动拆箱 ;结果为true;
                                // 当three==128时,返回为false
        System.out.println(three==100);  //自动拆箱;结果为true;
        System.out.println("five==200:  " + (five==100));  //自动拆箱; 结果为true.





/**
        float ff = 1.00f;
        System.out.println("type:  " + getType(a));
        System.out.println(getType(ff));
       */


        /**
         *
         String a = "aaa";
         char c = 'b';
         for( int i=60; i< 90;i++){
         System.out.println((char)i);
         }
         System.out.println("a--length   " + a.length() );
         System.out.println((char)65);
         System.out.println((int)c);
         System.out.println(('c') -1 & 0xFF);
         */

    }

     //自定义方法查看数据类型
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }


}


