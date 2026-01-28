package ch02.sec02;

public class VariableEx1 {

	public static void main(String[] args) {
		// 변수 연습문제 1
		String name = "홍길동";
		String no = "2015001"; // 명사
		int year = 4;
		char grade = 'A';
		float average = 93.5f;
		
		System.out.println(String.format("성명:%s", name));
		System.out.println(String.format("학번:%s", no));
		System.out.println(String.format("학년:%d", year));
		System.out.println(String.format("학점:%c", grade));
		System.out.println(String.format("평균:%f", average));
	}

}
