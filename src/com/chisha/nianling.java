package com.chisha;

import java.util.Scanner;

public class nianling {
	//�ж��������
public static void main(String[] args) {
		age();
	
	
}
public static void age() {
	System.out.println("");
	System.out.println("");
	System.out.println("������������");
	Scanner Age = new Scanner(System.in);
	int Age1 = Age.nextInt();
	boolean b1 = (Age1>=18 && Age1<=50);//�ж�Age1���ڻ����18�� ���� ������50
	System.out.println(b1);
//	//��һ�ַ��� ʹ��boolean ��ֱ���ж��Ƿ�������18~50֮��  �ɹ�����true 
	if(b1) {	//֮���Կ���ֱ��дb1 ������ֱ���ж�true/false
				//���b1��true��if�����ɹ�
		System.out.println("����������"+Age1);
		age();//�������д˷���
	}else {		//����ִ������
		System.out.println("����������䲻��18��~50��֮��");
		age();//�������д˷���
	}
	
	//�ڶ��ַ��� ����Ҫ��boolean���ֱ�true/false ֱ�Ӱ�����д��IF���� ��if�Լ����ж� �������߲�����
	//�ڶ��ַ�������
//	if(Age1>18&&Age1<50) {
//		System.out.println("����������"+Age1);
//		age();//�������д˷���
//	}else {
//		System.out.println("����������䲻��18��~50��֮��");
//		age();//�������д˷���
//	}
}
}
