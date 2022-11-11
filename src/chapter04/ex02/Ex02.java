package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스캐너로 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력해 주면 됩니다.
		// 출력 : 1월은 31일입니다.
		//		 2월은 28일입니다.
		//		month 월은 day 일 입니다.
		// switch 문으로 작성 : <<
		int month;
		int day ;

		Scanner sc = new Scanner(System.in);
		System.out.println("1월부터 12월까지 원하는 달을 선택하세요");
		month = sc.nextInt();
		
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		   day = 31;
		   System.out.println(month + "월은" + day + "일 입니다");
		   break;
		 
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.println(month + "월은" + day + "일 입니다");
			break;
			
		case 2:
			day =28;
			System.out.println(month + "월은" + day + "일 입니다");
			break;
			
			
		
		}
	}

}
