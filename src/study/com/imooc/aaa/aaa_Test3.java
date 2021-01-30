
//构造方法   https://www.bilibili.com/video/BV1sT4y1g7UK
//成员变量
package com.imooc.aaa; //在cmd环境测试需要注释掉此行
public class aaa_Test3 {
	public static class Baby {

    public  String namme;
    public  String sex;
    public  double weight;
    public  String bloodGroup;

    public  Baby(String name,String sex,double wieght,String bloodGraoup){
        this.namme = name;    //成员变量 = 参数(临时变量)
        this.sex = sex;
        this.weight = wieght;
        this.bloodGroup = bloodGraoup;
		 }
	}



    public static void main(String[] args) {
        Baby b1 = new Baby("gao","女",3.0,"o");
        System.out.println("bi name:  " + b1.namme);
        System.out.println("bi weight:  " + b1.weight);
    }
}
 
