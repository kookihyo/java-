package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main(String [] args) {
		//���� A�� �빮������ �ҹ������� Ȯ���ϼ���!
		//��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// ���� �빮�� Ȯ�� : true
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڸ� �Է����ֽÿ� :");
		char word = 'A'; //�ƽ�Ű�ڵ� Ȯ��
		boolean result = ('A'<= word) && (word <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
		
	
		
}
}