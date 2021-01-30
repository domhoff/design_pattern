package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description:
 */
public class FourPhone extends ThirdPhone implements IPhoto,INet{

//    public void  photo(){
//        System.out.println("手机可以拍照");
//    }

    public void netword(){
        System.out.println("手机可以上网");
    }

    public  void game(){
        System.out.println("手机可以玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }



    @Override
    public void network() {
        System.out.println("FourPhone  network");
    }

    @Override
    public void connection() {
        System.out.println("FourPhone  connection");
    }
}

