package com.chisha;

import java.util.Random;

public class suiji {
	public static void main(String[] args) {
		Random random = new Random();
		int  i = random.nextInt(5);
		switch (i) {
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��Ƥ");
			break;
		
		}
	}
}
