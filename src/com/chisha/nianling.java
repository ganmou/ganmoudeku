package com.chisha;

import java.util.Scanner;

public class nianling {
	//判断年龄程序
public static void main(String[] args) {
		age();
	
	
}
public static void age() {
	System.out.println("");
	System.out.println("");
	System.out.println("输入您的年龄");
	Scanner Age = new Scanner(System.in);
	int Age1 = Age.nextInt();
	boolean b1 = (Age1>=18 && Age1<=50);//判断Age1大于或等于18岁 并且 不超过50
	System.out.println(b1);
//	//第一种方法 使用boolean 来直接判断是否年龄在18~50之间  成功返回true 
	if(b1) {	//之所以可以直接写b1 是它是直接判断true/false
				//如果b1是true则if条件成功
		System.out.println("您的年龄是"+Age1);
		age();//重新运行此方法
	}else {		//否则执行这里
		System.out.println("您输入的年龄不在18岁~50岁之间");
		age();//重新运行此方法
	}
	
	//第二种方法 不需要用boolean来分辨true/false 直接把条件写在IF里面 由if自己来判断 成立或者不成立
	//第二种方法常用
//	if(Age1>18&&Age1<50) {
//		System.out.println("您的年龄是"+Age1);
//		age();//重新运行此方法
//	}else {
//		System.out.println("您输入的年龄不在18岁~50岁之间");
//		age();//重新运行此方法
//	}
}
}
