package com.chisha;

import java.util.Scanner;

public class Scanner_lianxi {
	public static void main(String[] args) {
		System.out.println("输入您的性别");
		Scanner c = new Scanner(System.in);
	String C = c.next();
	System.out.println(C);
			//equals 是等于的意思
			//所以下面这段话的意思是说 如果控制台输出的值为男 则为tuer
			
		if(C.equals("男")) {
			System.out.println("男的？");
		}else {
			System.out.println("给老子滚");
		}
		
		
		//练习Scanner
		/*System.out.println("输出一个数字");
		
	Scanner a = new Scanner(System.in);
	int A = a.nextInt();
	
	
	if(A>2) {
		System.out.println("您输出的值大于2");
		System.out.println("在输出一个数字");
		
	}
	Scanner b = new Scanner(System.in);
	int B = b.nextInt();
	if(B<=-10) {
		System.out.println("您输出的数字为:"+B+"大于-10");
	}*/	

	}
}
