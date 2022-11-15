package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//  <문제> : 오늘 까지 : <<12시 까지>>
		
		int select;
		int n;
		int i = 0;
		

		Scanner sc= new Scanner(System.in);
		
		do {
			
			System.out.println("========================================================");
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고. 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도로고 값을 넣는데 4배수만 빼고 저장후 출력");
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3씩 증가하도록 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼기");
			System.out.println("4.프로그램 종료");
			
			select = sc.nextInt();
			
			
			if ( select == 1)
			{
				System.out.println("방의 크기를 지정하세요");
				n=sc.nextInt();
				int room1[]=new int[n];
					for(int a = 1 ; a < 5000 ; a++)
					{
						if (a%7==0 || a%8==0)
						{
							for (i = 0 ; i < n ; i++)
							{
								room1[i]=a;
								System.out.println(room1[i]);
						    }
							
					     }
					
				    }
							
			}
				
			
			else if (select ==2)
			{
				
			}
			else if (select ==3)
			{
				
			}
			else if (select ==4)
			{
				break;
			}
			
		}while(true);
		
	}

}
