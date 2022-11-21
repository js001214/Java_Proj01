package chapter07.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 
		
		//배열 a : 7의 배수를 저장하는 배열 1~500
		//배열 b : 9의 배수를 저장하는 배열 1~500
		
		// 두 배열의 각 방의 값을 더해서 출력
		
		int a[] = new int[500/7];
		int b[] = new int[500/9];
		
		for ( int i = 0, j = 7 ; i < a.length ; i++, j+=7)
		{
			a[i]=j;
			
		}
		
		System.out.println("=======7의 배수========");
		System.out.println(a.length + "방");
		for ( int i = 0 ; i < a.length ; i++)
		{
			System.out.print  (a[i] + " ");
		}
		System.out.println ();
		
		for ( int i = 0, j = 9 ; i < b.length ; i++, j+=9)
		{
			b[i]=j;
			
		}
		
		System.out.println("=======9의 배수========");
		System.out.println(b.length + "방");
		for ( int i = 0 ; i < b.length ; i++)
		{
			System.out.print  (b[i] + " ");
		}
		
		System.out.println();
		Array(a,b);
		Array2(a,b);
		
	}
	
	
	public static void Array(int a[], int b[])
	{
		for(int i = 0 ; i < b.length ; i ++)
		{
			a[i] = a[i] + b[i];
		}
		System.out.println("===========================================");
		System.out.println(" 두 배열의 합 ");
		System.out.print(Arrays.toString(a) + " ");
		System.out.println();
		
		
	}
	public static void Array2(int a[], int b[])
	{
		int c[] = new int[71];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				if(i > 54)
				{
					c[i] = a[i] + 0;
				}
				if ( i == j )
				{
					c[i] = a[i]  + b[i];
					
				}
			}


		}
		System.out.print(Arrays.toString(c) + " ");
	}

}
