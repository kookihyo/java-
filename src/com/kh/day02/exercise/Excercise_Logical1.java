package com.kh.day02.exercise;

public class Excercise_Logical1 {
	public static void main(String [] args) {
		//50�� 1~100 ������ �������� Ȯ���ϼ���!
		//��, 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���.
		//1���� 100������ �����ΰ�? : true
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� :");
		int num;
		int num= 50
		boolean result; 
		result = (1 < num) && (num < 100);
		System.out.println("1���� 100������ �����ΰ�? : " + result);
}
}