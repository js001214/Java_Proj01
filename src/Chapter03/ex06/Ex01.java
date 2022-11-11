package Chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//<문제> 스캐너로 정수 값을 input 받고, input받은 정수값이 홀수이면 "홀수" 라고 출력하고
		//input 받은 값이 짝수이면 "짝수"라고 출력
		//삼항 연산자를 사용해서

		int value1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값을 입력하세요");
		value1 = sc.nextInt();
		System.out.println(value1 + "은" + (value1 % 2==0 ? "짝수입니다" : "홀수입니다"));
		
		
		
		
		
	}

}
