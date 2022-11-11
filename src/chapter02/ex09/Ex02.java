package chapter02.ex09;

import java.util.Scanner;

public class Ex02 {

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
		String name4; 
		
		int ma ;
		int fa ;
		int ba ;
		int mya ;
		
		
		
		System.out.println("엄마 이름");
		name1 = sc.next();
		System.out.println("아빠 이름");
		name2 = sc.next();
		System.out.println("형 이름");
		name3 = sc.next();
		System.out.println("내 이름");
		name4 = sc.next();
		
		
		System.out.println("엄마 나이");
		ma = sc.nextInt();
		System.out.println("아빠 나이");
		fa = sc.nextInt();
		System.out.println("형 나이");
		ba = sc.nextInt();
		System.out.println("내 나이");
		mya = sc.nextInt();
		
		int sum = ma + fa + ba+mya ;
		double avg = sum / 5.0;
		
		
		System.out.println("엄마 이름" + name1);
		System.out.println("아빠 이름" + name2);
		System.out.println("형 이름" + name3);
		System.out.println("나 이름" + name4);
		
		System.out.println("가족나이의 합은" + sum + "이다");
		System.out.println("가족나이의 평균은" + avg + "이다");
		
		

	}

}
