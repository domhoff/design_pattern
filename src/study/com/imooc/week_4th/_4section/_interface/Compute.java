package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description:
 */
public class Compute  implements INet{

    @Override
    public void connection() {
        System.out.println("我是Compute类中的链接");
    }

//    public void network(){}{  // 错误,多写一对{}
//    public void network(){
//        System.out.println("电脑可以上网");
//    }

    public void game(){
        System.out.println("电脑可以玩游戏");
    }
    public void vedio(){
        System.out.println("电脑可以看视频");
    }
    public void music(){
        System.out.println("电脑可以听音乐");
    }

    @Override
    public void network() {
        System.out.println("Compute network");

    }
}
