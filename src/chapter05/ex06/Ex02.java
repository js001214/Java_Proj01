package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>
		
		  //2차원 배열 변수: arr1  													/arr1[4][100]의  arr1[0]
		  //arr1[0] <==2의 배수만 저장
		 // arr1[1] <==5의 배수만 저장
		 // arr1[2] <==3의 배수와 8의 배수를 저장
		 // arr1[3] <==1부터 시작해서 1씩 증가하는데 7의 배수는 저장하지 않도록 저장
		  
		//  행의 개수 :  4
		//  열의 개수 : 100
		  
		//  1.for문으로 출력, 2. Enhanced for, 3. Arrays.toString
		 
		
		int[][] arr1 =new int [4][100];
		
		for (int i = 0 ; i < arr1.length ; i ++ )//i 0 1 2 3 [4] 
		{
			if (i == 0)
			{
				for(int j = 0, a = 1 ; j <arr1[i].length; a++)
				{
					if(a%2==0) 
					{
						arr1[i][j]=a;
						j++;			
					}
					
				}
			}
			else if (i == 1)
			{
				for(int j = 0 , a= 1 ; j < arr1[i].length; a++)
				{
					if (a%5==0)
					{
						arr1[i][j] = a;
						j++;
					}
				}	
			}
			else if (i == 2)
			{
				for(int j = 0 , a = 1 ; j < arr1[i].length; a++)
				{
					if(a%3==0 || a%8==0)
					{
						arr1[i][j] = a;
						j++;
					}
					
				}
			}
			else if (i == 2)
			{
				for(int j = 0 , a = 1 ; j < arr1[i].length; a++)
				{
					if(a%7==0);
					{
						arr1[i][j] = a;
						j++;
					}
						
				}
					
			}
			else if ( i == 3)
			{
				for(int j = 0 , a = 1 ; j < arr1[i].length; a++)
				{
					if(a%7==0)
					{
						continue;
					}
					arr1[i][j] = a;
					j++;
						
				}
			}
			
			
		}
		// int[][] arr1 =new int [4][100];
		//for문 출력
		for (int i = 0 ; i < arr1.length ; i ++ )
		{
			for (int j = 0 ; j < arr1[i].length ; j ++)
			{
				System.out.print(arr1[i][j]+ " ");;
			}
			System.out.println();
		}
		System.out.println("==========================================");
		//enhanced for문 출력
		for (int[] a : arr1) // 2차원  이상의 배열이니까 int[] a(1차원배열)로 arr1을 받아준다.
		{
			for (int k : a) //정수 k에 a를 담고 하나씩 보내준다.
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		//3. Arrays.toString
		for(int[] a : arr1)	//2차원 이상의 배열을 enhanced나 Arrays로 출력할땐 for ( int[] k : arr1)으로 일단 1차원 배열로 받아주고 정수값으로 출력한다.
		System.out.println(Arrays.toString(a));

		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	