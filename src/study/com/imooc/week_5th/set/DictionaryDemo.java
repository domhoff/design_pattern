package com.imooc.week_5th.set;

import java.util.*;
import java.util.Map.*;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/27
 * @description:
 * 第5周,第4节, 4-3
 */
public class DictionaryDemo {
    public static void main(String[] args) {

        Map<String, String> animal = new HashMap<String, String>();
        //Map 接口; HashMap 类
        System.out.println("请输入三组单词对应的注释,并存放到HashMap中");
        Scanner console = new Scanner(System.in);

        //添加数据
        int i = 0;
        while(i<3){
            System.out.println("请输入key");
            String key = console.next();
            System.out.println("请输入value");
            String value=console.next();
            animal.put(key, value);
            i++;
        }

        //打印输出value的值(直接用迭代器)
        System.out.println("\n使用迭代器输出所有value: ");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()){
            System.out.print(it.next() + "  ");
        }

        //打印输出key,value的值
        System.out.println("\n通过entrySet方法得到key-value: ");
        Set<Entry<String,String>> entrySet = animal.entrySet();
        for(Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey() + "-" +entry.getValue());
        }

        //通过单词找到注释并输出 4-5
        //使用keySet主法
        System.out.println("请输入要查找的单词: ");
        String strSearch=console.next();
        //1.取得keySet
        Set<String> kyeSet=animal.keySet();
        //遍历keySet
        for(String key:kyeSet){
            if(strSearch.equals(key)){
                System.out.println("找到了!" + "键值对为: " + key + "-" + animal.get(key));
                break;
            }
        }


    }
}
