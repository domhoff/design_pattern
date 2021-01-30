package com.imooc.week_5th.set;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/19
 * @description:
 * 第5周,第5节,3-7
 */
public class Cat {
    private  String name;
    private  int month;
    private  String  species;


    //构造方法
    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }


    //---- Ooerride  hashCode,Over equals


    @Override
    public boolean equals(Object o) {

        //idea生成代码
        if (this == o) return true;    //比较地址;当前语句无返回
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return month == cat.month &&
                name.equals(cat.name) &&
                species.equals(cat.species);

    }

        /**
        //eclipse自动生成equals代码
         if(this == o)  //判断对象是否相等,相等则用比较属性,返回true.
             return true;
         //判断o是否是Cat类对象
         if(o.getClass()==Cat.class){
             Cat cat = (Cat)o;
             return  cat.getName().equals(name)
                     &&(cat.getMonth()==month)
                     &&(cat.getSpecies().equals(species));
         }
         return false;
    }  */

    @Override
    public int hashCode() {
//        return Objects.hash(name, month, species);  //idea提供,测试过此句具有下列语句所具有的功能.

        //根据视频手写
        final int prime =31;
        int result =1;
        result = prime * result + month;
        result = prime * ((name ==null) ? 0:name.hashCode());
        result = prime * ((species ==null) ? 0:species.hashCode());
        return  result;
    }
}


