package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록하고 import해주고                
		// 이름, 어머니 이름, 아버지 이름, 형제 이름, 자신 이름			sc.next();
		// 어머니 나이, 아버지 나이, 형제 나이 ,자신 나이				sc.nextInt();
		
		// 콘솔에서 인풋 받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		String name1 ;
		String name2 ;
		String name3 ;
		String name4 ;
		
		int motherage;
		int fatherage;
		int brotherage;
		int myage;
		
		System.out.println("어머니 이름을 입력하세요.");
		name1 = sc.next();
		System.out.println("아버지 이름을 입력하세요.");
		name2 = sc.next();
		System.out.println("형제의 이름을 입력하세요.");
		name3 = sc.next();
		System.out.println("자신의 이름을 입력하세요.");
		name4 = sc.next();
		
		System.out.println("어머니 나이 입력하세요.");
		motherage = sc.nextInt();
		System.out.println("아버지 나이 입력하세요.");
		fatherage = sc.nextInt();
		System.out.println("형제의 나이를 입력하세요.");
		brotherage = sc.nextInt();
		System.out.println("나의 나이 입력하세요.");
		myage = sc.nextInt();
		
		int sum;
		sum = motherage + fatherage + brotherage + myage;
		
		double avg;
		avg = sum / 5.0;
		
		
		System.out.println("어머니의 이름은" + name1 + "이고");
		System.out.println("아버지의 이름은" + name2 + "이고");
		System.out.println("형제의 이름은" + name3 + "이고");
		System.out.println("나의 이름은" + name4 + "이다");
		
		System.out.println("가족나이의 합은" + sum + "이다");
		System.out.println("가족나이의 평균은" + avg + "이다");
		

	}

}
