package com.imooc.week_4th._3section;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/5
 * @description:
 */
public class Dog extends Animal__ {
    //属性
    private  String  sex;

    public  Dog(){

    }

    public Dog(String name,int month,String sex){
        this.setMonth(month);
        this.setName(name);
//        super(name,month); //与上两行等价
        this.setSex(sex);

    }


    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    //方法:睡觉
    public  void  sleep(){
        System.out.println("小狗有午睡的习惯");
    }


    //重写 父类
    @Override
    public void eat() {
//        System.out.println("狗吃肉~~~~");
        System.out.println();
    }
}



