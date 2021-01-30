package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/8
 * @description:
 * 使用接口的引用指向它实现类对象  代码来自:https://blog.csdn.net/leng15183596537/article/details/89318188
 */
    public class Debug_implemet {
        public static void main(String[] arhs) {
            Test a = new A();    //接口引用指向实现类;实例化对象,未调用对象内方法.

//            Test t = new B(a);  //接口引用指向实现类B.
            Test t = new AB(a);  //接口引用指向实现类AB.
            t.small();   //  跳到 AB类-->51行 ;调用接口方法.
            }
        }

    interface Test{
            void small();
        }



    class  A implements Test{
    @Override
    public void small() {
        System.out.println("我是A");
    }
    }

    class B implements Test{
        public B(Test test) {
        }

        @Override
        public void small() {
            // TODO Auto-generated method stub
            System.out.println("我是B");
        }

    }

    class AB implements Test{
        private Test test;  //接口作为参数
//        private Test a;  //接口作为参数

         AB(Test test){    //构造方法
            this.test = test;

        }



        @Override
        public void small() {
            // TODO Auto-generated method stub
            System.out.println("**********");
            test.small();
        }

    }


