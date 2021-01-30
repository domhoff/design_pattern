package com.imooc.week_4th._3section;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/7
 * @description: 第4周,第3节,3-14
 */
public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();
        master.feed(one);
        master.feed(two);
        System.out.println("\n---------------------");
        boolean isManyTime=true;
//        Animal temp;
//        if(isManyTime){
//            temp=master.hasManyTime();
//        }else{
//            temp=master.hasLittleTime();
//        }
//        System.out.println("=="+ temp.toString() +"\n" + temp);
//    }

        Animal__ temp=master.raise(true);
        System.out.println("=="+ temp.toString() +"\n" + temp);
    }

}
