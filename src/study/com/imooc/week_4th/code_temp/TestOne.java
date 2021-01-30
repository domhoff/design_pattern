package com.imooc.week_4th.code_temp;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/9
 * @description:
 */

interface One { static int x=11;}

interface Two { final int x=22;}

class Three { public int x=33;}

public class TestOne extends Thread implements One,Two
{
    public int x = 44;  //常量定义在局部这量中.代码正确
    public void test(){
//        System.out.println(One.x);
        System.out.println(x); //引用不明确
    }

    public static void main(String[] args){
        new TestOne().test();
    }
}