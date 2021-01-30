package com.imooc.week_4th._3section;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/6
 * @description:
 *第4周 第3节 3-14
 */
public class Master {
    public Master() {
    }

    /**喂食物
     *喂猫咪:吃完东西后,主人会带着去去玩线球
     *喂狗狗:吃完东西后,主人会带着狗狗去睡觉
     */

    /**feed方法重载;要写多个重载方法
     *方案1
     */
    /*
    public  void feed(Cat cat){
        cat.eat();
        cat.playBall();
    }

    public  void feed(Dog dog){
        dog.eat();
        dog.sleep();
    } */


    /**
     * 方案2;通过类型转换,调用指定子类的方法.
     * 向下转型; 缺点,维护性不好.
     */
    public void feed(Animal__ obj){
        if(obj instanceof Cat){
            Cat temp=(Cat)obj;  //强制类型转换,子类引用-->父类实列;强转成Cat类型.
            temp.eat();
            temp.playBall();
        }else if(obj instanceof Dog){
            Dog temp=(Dog)obj;
            temp.eat();
            temp.sleep();
        }
    }

        /**
         *饲养宠物
         * 空时时间多:养狗
         * 空闲时间不多:养猫咪
         */
        //方案1 第4周 第3节  3-16
//        public Dog hasManyTime(){
//            System.out.println("主人休闲时间比较足,适合养狗狗");
//            return new Dog();
//        }
//        public Cat hasLittleTime(){
//            System.out.println("主人比较忙碌,适合养猫咪");
//            return  new Cat();
//        }
//
        //方案2  第4周 第3节  3-16
        public Animal__ raise(boolean isMasterTime){
            if(isMasterTime){
                System.out.println("主人休闲时间比较足,适合养狗狗");
                return new Dog();
            }else{
                System.out.println("主人比较忙碌,适合养猫咪");
                return new Cat();
            }
        }


}
