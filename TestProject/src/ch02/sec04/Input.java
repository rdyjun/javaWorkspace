package ch02.sec04;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		System.out.println(num1 + " :: " + num2);
		
		System.out.println("두 수의 합은 : " + (num1 + num2));
		System.out.println("두 수의 곱은 : " + (num1 * num2));
		
		System.out.println("문자열을 입력하세요");
		String grade = sc.next();
		System.out.println(grade);
		
		System.out.println("문자를 입력하세요");
		char grd = sc.next().charAt(0);
	}

}
