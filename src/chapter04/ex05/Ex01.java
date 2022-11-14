package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 사용해서 input을 받고 do whlie문으로 무한 루프를 돌립니다.
		// 스캐너에서 1을 넣으면 "1. 평균 출력"
		// 4번을 누르면 do while문 종료
		// 1~4이 외의 번호를 넣으면 "잘못된 입력입니다." 1~4번까지만 넣으세요"
		System.out.println("===================================");
		System.out.println("1.평균출력 | 2. 합계 출력 | 3.이름 | 4. 프로그램 종료");
		System.out.println("===================================");
		Scanner sc = new Scanner(System.in);
		
		int select;
		do
		{
			 
			select = sc.nextInt();
			if (select == 1)
			{
			System.out.println("1.평균 출력");
			}
			else if (select == 2)
			{
				System.out.println("2.합계 출력");
			}
			else if (select ==3 )
			{
				System.out.println("3.이름 출력");
			}
			else if (select >= 5)
			{
			System.out.println("1~4이 외의 번호를 넣으면 \"잘못된 입력입니다.\" 1~4번까지만 넣으세요");
			}
		} while (select != 4  );
		
		
		
		
		int a;
		do 
		{
			System.out.println("===================================");
			System.out.println("1.평균출력 | 2. 합계 출력 | 3.이름 | 4. 프로그램 종료");
			System.out.println("===================================");
			a = sc.nextInt();
			
			if (a==1) 
			{
				System.out.println("1.평균 출력");
			}
			else if (a==2)
			{
				System.out.println("2.합계 출력");
			}
			else if (a==3)
			{
				System.out.println("3.이름 출력");
			}
			else if (a==4)
			{
				break;
			}
			else
			{
				System.out.println("1~4이 외의 번호를 넣으면 \"잘못된 입력입니다.\" 1~4번까지만 넣으세요");
			}
		}while(true);
		
		System.out.println("do while문을 빠져나왔습니다.");
		
		
	}
}
