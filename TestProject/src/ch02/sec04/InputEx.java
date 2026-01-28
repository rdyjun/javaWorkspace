package ch02.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// 데이터 타입에 맞춰 입력 받고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("학년 입력 : ");
		int year = sc.nextInt();
		System.out.print("점수 입력 : ");
		float score = sc.nextFloat();
		System.out.print("학점 입력 : ");
		char grade = sc.next().charAt(0);
		
		System.out.println(String.format("이름 : %s", name));
		System.out.println(String.format("학년 : %d", year));
		System.out.println(String.format("점수 : %.1f", score));
		System.out.println(String.format("학점 : %c", grade));
	}

}
