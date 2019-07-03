package com.chisha;

public class fuzhi {
public static void main(String[] args) {
	//关于赋值
		short s1 = 10;//✔
		short s2 = 2;//✔
		short s3 = 5;//✔
		short s4 = 4;//✔
		short s5 = 13;//✔
		//s1 = s1+10;这么写是错误的  因为+10的过程就是参与了运算 就变成了int类型  需要转换类型 （）
					//int类型是大  short类型是小 需要 大转小
		s1 = (short)(s1+10);//需要手动强转    为什么不是short 转成int呢  因为我们给s1的类型就是short 而(s1+10)是int型
		System.out.println(s1);//得20
		s1+=10; //这两句话的效果都是+10 但是因为这个写法是扩展赋值 系统会自动帮你强转
		System.out.println(s1);//得30
		//同理
		s2*=2;//等于s2*2 	得4
		s3-=3;//等于s3-3 	得2
		s4/=2;//等于s4/2	得2
		s5%=2;//取余数 有余数 则为1 整除则为0
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
}
}
