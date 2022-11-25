package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//입력받을 수 있는 데이터는 
		//정수,실수,문자열, 문자
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력해주세오: ");
	int iNum = sc. nextInt();
	
	System.out.print("실수를 입력해주세오: ");
	double dNum = sc. nextDouble();
	
	System.out.print("문자열을 입력해주세오: ");
	String words = sc.next(); //nextString() 없다
	
	System.out.print("문자를 입력해주세오: ");
	char word = sc.next().charAt(0); // AVC, nextchar() 없다.
	
	System.out.print("입력한 정수는 :" + iNum);
	System.out.print("입력한 실수는 :" + dNum);
	System.out.print("입력한 문자열은 :" + words);
	System.out.print("입력한 문자는 :" + word);
	}
}
