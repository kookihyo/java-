package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		// 남자이면서 평균학점 4.3이상인 사람 -> and
		// 컴퓨터공학과 또는 경영학과인 사람 -> or
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; //변수의 선언
		// num1과 num2가 다르면서 num2가 num1보단 클때
		result1 = (num1 != num2)  && (num1 < num2);
		System.out.println("result1의 결과값 : "+ result1);
		result2 = (num1 <num2) || (num1 == num2);
		// false
		result3 = (num1 > num2) && (num1 != num2);
		// true
		result4 = (num1 > num2) || (num1 == num2);
		// true
		System.out.println("result2의 결과값 : "+ result2);
		System.out.println("result3의 결과값 : "+ result3);
		System.out.println("result4의 결과값 : "+ result4);
		System.out.println("논리연산자 예제2");
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		//result1:true, aNum :71, bNum: 55 ||(or) 앞이 true면 뒤에는 계산안함
		result2 = (aNum < bNum) && (--bNum < 55);
		//result2:false, aNum: 71, bNum: 55 &&(and)는 앞이 false면 뒤에 계산안함
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		System.out.println("result1의 결과값 : "+ result1);
		System.out.println("result2의 결과값 : "+ result2);
		System.out.println("result3의 결과값 : "+ result3);
		System.out.println("result4의 결과값 : "+ result4);
	
	}

}
