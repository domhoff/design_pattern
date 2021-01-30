package com.imooc.week_2th;


// 第2周.第4节.6-1 可变参数列表
public class ArgsDemo1{

	public void search(int n,int... a){
		boolean flag = false;
		for(int a1:a){
			if(a1==n){
				flag=true;break;
			}
		}

		if(flag){
			System.out.println("找到了" + n);
		}else{
			System.out.println("没找到" + n);
		}

	}




	public static void main(String[] args){
		ArgsDemo1 ad1 = new ArgsDemo1();
		ad1.search(3,1,2,3,4,5);
		int[] a = {1,3,3,4,5};
		//ad1.search(3,a);

	}

}
