package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//�Է¹��� �� �ִ� �����ʹ� 
		//����,�Ǽ�,���ڿ�, ����
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է����ּ���: ");
	int iNum = sc. nextInt();
	
	System.out.print("�Ǽ��� �Է����ּ���: ");
	double dNum = sc. nextDouble();
	
	System.out.print("���ڿ��� �Է����ּ���: ");
	String words = sc.next(); //nextString() ����
	
	System.out.print("���ڸ� �Է����ּ���: ");
	char word = sc.next().charAt(0); // AVC, nextchar() ����.
	
	System.out.print("�Է��� ������ :" + iNum);
	System.out.print("�Է��� �Ǽ��� :" + dNum);
	System.out.print("�Է��� ���ڿ��� :" + words);
	System.out.print("�Է��� ���ڴ� :" + word);
	}
}
