package com.chisha;

import java.util.Scanner;

public class Scanner_lianxi {
	public static void main(String[] args) {
		System.out.println("���������Ա�");
		Scanner c = new Scanner(System.in);
	String C = c.next();
	System.out.println(C);
			//equals �ǵ��ڵ���˼
			//����������λ�����˼��˵ �������̨�����ֵΪ�� ��Ϊtuer
			
		if(C.equals("��")) {
			System.out.println("�еģ�");
		}else {
			System.out.println("�����ӹ�");
		}
		
		
		//��ϰScanner
		/*System.out.println("���һ������");
		
	Scanner a = new Scanner(System.in);
	int A = a.nextInt();
	
	
	if(A>2) {
		System.out.println("�������ֵ����2");
		System.out.println("�����һ������");
		
	}
	Scanner b = new Scanner(System.in);
	int B = b.nextInt();
	if(B<=-10) {
		System.out.println("�����������Ϊ:"+B+"����-10");
	}*/	

	}
}
