package com.imooc.week_4th._4section._interface;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description: 一代手机
 */
public class Telphone {
    private  String brand;
    private  int price;

    public  Telphone(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void call(){
        System.out.println("手机可以打电话");
    }
}
