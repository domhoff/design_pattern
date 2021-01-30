package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description:
 */
public class Camera implements IPhoto {
//    public void phone(){
//        System.out.println("相机可以拍照");
//    }


    @Override
    public void photo() {
        System.out.println("\n相机可以拍照");
    }
}
