package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		//�ڷ��� ������ ���Կ����� ������;
		// 1.�ڷ����� ����
		// ����, ���ڿ�
		// int, String
		// ������Ʈ
		byte bNum = 127; // -128~127
		short sNum = 32767; // -32768~32767
		int iNum = 2147483647; //-2147483648~2147483647
		long lNum = 2147483648l; //���̻� l�� �ٿ�����
		short num = 128;
		//�Ǽ���Ʈ
		float fNum = 22.1123f; //���̻� f �ٿ�����
		double dNum = 23.502; //��� ���Ҷ� ���� ���
		//������Ʈ
		char fChar = 'A'; // Ȭ����ǥ �ȿ��� 1���� ����
		String sChar = "Hello World"; // �ֵ���ǥ �ȿ��� ������ ����
		// Boolean��
		boolean result = false;
		// 1>0 ,2<1
		
		System.out.println("������ �� : "+iNum);
		System.out.println("������ ��(9999��) : "+iNum);
		System.out.println("�Ǽ��� �� :"+fNum);
		System.out.println("�Ǽ��� �� :" +dNum);
		System.out.println("������ �� :" +fChar);
		System.out.println("���ڿ��� �� :" +sChar);
		System.out.println("����� �� :" + result);
		
		fChar = 66;
		System.out.println("���ڿ� ���� :"+ fChar);
		fChar = 75;
		System.out.println("���ڿ� ����2 :"+ fChar);
		// ASCII(�ƽ�Ű) �ڵ�
		//->����(CHAR)�� ���ڸ� ������ ���ְ� ASCII�ڵ忡 
		// ���εǾ��ִ� ���ڷ� ��� ����
	}
}
