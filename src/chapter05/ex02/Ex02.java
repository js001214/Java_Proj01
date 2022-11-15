package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 배열 변수 : arr1, 배열의 방의 갯수 : 500개
		//배열방에 3의 배수 또는 5의 배수를 저장
		//출력 : 1.for , 2. Enhanced For, 3. Arrays.tostring() 를 사용해서 출력
		
		
		//1
		int i =0;
		int[] arr1 = new int[500];
		for (int a =1 ; a < 3000; a++) 
		{
			if ( a% 3 ==0 || a % 5 ==0)
			{
				arr1[i] = a;
				i++;
			}
			
			if ( i > 499)
			{
				break;
			}
		}
		
		System.out.println("=====for 문으로 출력=====");
		for ( i = 0 ; i < 500 ; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("=========Enhanced For=========");
		for ( int k : arr1) 
		{
			System.out.printf("%d" , k);
		}
		System.out.println();
		System.out.println("====Arrays.toString()==========");
		System.out.println(Arrays.toString(arr1));
			
		
	}
}

	
