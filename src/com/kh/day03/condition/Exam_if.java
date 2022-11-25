package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_if {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö ÇÏ³ª ÀÔ·Æ");
		int input = sc.nextInt();
		String result ="";
		//Â¦¼ö ÆÇº°
		// (input % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
		if(input % 2 == 0)
			result = "Â¦¼ö";
		else
			result = "È¦¼ö";
		System.out.println(input + "Àº/´Â" + result + "ÀÔ´Ï´Ù");
		
	}
}
