package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name =sc.next();
		System.out.println("태어난 월을 입력해주세요");
		int month =sc.nextInt();
		System.out.println("키를 입력해주세요");
		double height = sc.nextDouble();
		System.out.println("성별을 입력해주세요");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력해주세요");
		sc.nextLine(); //엔터 제거
		String address =sc.nextLine();
		System.out.println("이름은"+ name +"입니다");
		System.out.println("태어난 월은"+ month +"입니다");
		System.out.println("키는"+ height +"입니다");
		System.out.println("성별은"+ gender +"입니다");
		System.out.println("주소는"+ address +"입니다");
		
	}
	//이름을 입력해주세요. // next()
	//구기효
	// 태어난 월을 입력해주세요.
	//8
	//키를 입력해주세요.
	//173
	//성별을 입력해주세요.
	//남
	//주소를 입력해주세요. //nextLine()
	//경기도 남양주
	//이름은 구기효입니다.
	//태어난 월은 8입니다.
	//키는 173입니다.
	//성별은 남입니다.
	//주소는 경기도 남양주시입니다.
	

}
