package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		//  
		
		// 두 배열의 각 방의 내용을 더해서 출력 하는 메소드 생성
		
		// 배열 a : 4의 배수를 1 ~ 300까지 저장
		// 배열 b : 5의 배수를 1 ~ 300까지 저장

		// 두 배열의 각 방의 값을 더해서 출력
		
		
		int a[] = new int [300/4];
		
		for (int i = 0, j = 4; i < a.length ; i ++,j+=4)
		{
			a[i]=j;
		}
		System.out.println("===4의 배수 출력================================");
		System.out.println(a.length);	//방의 수
		for (int i = 0 ; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int b[] = new int [300/5];
		
		for (int i = 0, j = 5; i < b.length ; i ++,j+=5)
		{
			b[i]=j;
		}
		
		System.out.println("===5의 배수 출력================================");
		System.out.println(b.length);	//방의 수
		for (int i = 0 ; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	
		System.out.println();
		System.out.println();
		addArray(a,b);
	
		
		
		
		
	}
	
		//두개의 배열을 인풋 받아서 각 방의 값을 더해서 출력
	
	//addArray(int[] a, int[] b){
	//}
	public static void addArray(int[] a, int[] b)
	{
	 	
		for(int i = 0 ; i <b.length ; i++)
		{
			a[i] = a[i] + b[i];
			
		}
		 	System.out.println(Arrays.toString(a));
		 
	 	
		
	}

}

/*
 
 
 
 
 
 for ( int k : a)
	 	{
	 		System.out.print(k + " ");
	 	}
	 	for ( int j : b)
	 	{
	 		System.out.print(j + " ");
	 	}
 
 */


