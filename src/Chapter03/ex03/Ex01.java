package Chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <실습 문제>  <완료시간 6:10> p.jangwoo@gmail.com
		// 정수 2개를 Scanner로 Input 받고 두 값이 같으면 true를 다르면 false 출력
		// 이름 2개를 Scanner로 Input 받고 두 값이 true를 다르면 false 출력
			// 등가연산자 사용. 
			// 기본자료형 : ==
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		int b ;
		
		System.out.println("a에 정수를 입력하세요");
		a = sc.nextInt();
		System.out.println("b에 정수를 입력하세요");
		b = sc.nextInt();
		
		System.out.println(a == b);
 
		
		
			// 참조자료형 : aName.equals(bName)
		
		String aName;
		String bName;
		
		
		System.out.println("a의 이름을 입력하세요");
		aName = sc.next();
		System.out.println("b의 이름을 입력하세요");
		bName = sc.next();
		
		System.out.println(aName.equals(bName));

	}

}
