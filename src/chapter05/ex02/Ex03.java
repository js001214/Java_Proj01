package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방번호를 인풋 받습니다.
		// 배열 변수 : arr1, 2의 배수를 저장후 출력, enhanced for문을 사용해서 출력
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력, for문을 사용해서 출력
		// arr1.length
		
		int n; //방의 개수
		int i;
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		int arr1[] = new int[n ];
		for (i = 0 ;  i < arr1.length ; i++)
		{
				arr1[i] = (i+1)*2;
				
		}
		for ( int k : arr1)
		{
			System.out.print(k + " ");
		}

System.out.println("=================================");
		System.out.println();
		
		System.out.println("숫자를 입력하세요.");
		n =sc.nextInt();
		int arr2[] = new int[n];
		for (i = 0 ;  i < n ; i++)
		{
				arr2[i] = (i+1)*3;
				System.out.print(arr2[i] + " ");
				
		}
		System.out.println();
		System.out.println("arr1  "+arr1.length+"개"); //방 개수 : 5
		System.out.println("arr2  "+arr2.length+"개"); //방 개수 : 100
		
		
		
		

	}

}


