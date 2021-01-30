package com.imooc.week_6th_7th;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2021/1/2
 * @description:
 * 第6-7周,第1节,4-3; 接口实现与类比较器在一起
 */
public class Goods implements Comparable<Goods> {

    private String id; //商品编号
    private  String name; //商品名称
    private  double price; //商品价格


    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "商品编号:" + id +
                " ,商品名称:" + name +
                " ,商品价格:" + price ;
    }

    @Override    //类比较器
    public int compareTo(Goods o) {
        double price1=this.getPrice();//当前价格
        double price2=o.getPrice();//o对象价格
        int n=new Double(price2-price1).intValue();   //降序

        return n;
    }

}
