package com.kh.day02.operator;

public class Exam_Unary {
	public static void main(String[] args) {
		//1+2,2X3. 4/2
		//���׿�����,���׿�����
		// a++,a--,b++,b--
		//++a,--a,++b--b
		//a=a+1,a=a-1,b=b+1,b=b-1
		//int a = 1;
		//System.out.println(a++);
		//System.out.println(a); //��������(���߿���)
		//System.out.println(++a); //��������(��������)
		
		
		System.out.println("1�� ����");
		System.out.println("a++");
		System.out.println("b = (a--) + b");
		System.out.println("c = (a++) + (b--)");
		int a = 11;
		int b = 29;
		int c = 39;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a�� ��:" + a);
		System.out.println("b�� ��:" + b);
		System.out.println("c�� ��:" + c);
		
		System.out.println("2�� ����");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y= y-- + y + ++y;");
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y= y-- + y + ++y;
		System.out.println("x�� ��:" + x);
		System.out.println("y�� ��:" + y);
		System.out.println("z�� ��:" + z);
		//����������
		boolean result = true;
		System.out.println("result�� �� :"+ result);
		System.out.println("!result�� �� :"+ !result);
		
		
	}
}
