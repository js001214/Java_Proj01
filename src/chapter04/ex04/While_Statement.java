package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// While 문 : 반복문  //조건이 true일 동안 반복, 조건이 false이면 실행블럭을 빠져나온다.
		/*
		 for (초기식; 조건; 증감식) 
		 {
		 	실행블럭;
		 }
		 
		 */
		
		/*
		 초기값
		 while (조건)
		 {
		  	실행블럭;
		  	증감식;
		 }
		 */
		
		
		//1. while문의 기본 문법 구조 (증감식을 처리하지 않으면 무한루프)
		System.out.println("========while 문으로 출력=========");
		
		int a = 0 ; //초기값
		while (a < 10) //조건
		{
			System.out.print(a + " ");
			a++; //증감식
		}
		
		//2. for 문으로 변환
		System.out.println("\n=========for문으로 출력============");
		for ( a=0; a<10; a++) 
		{
		System.out.print(a + " ");	
		
		
		}
		System.out.println();
		System.out.println("==========================");
		
		//while 문으로 vs for 문으로 처리 ;  100부터 1까지 2씩 감소 해서 출력
		
		int b = 100;
		while (b > 0)
		{
			System.out.print(b + " ");
			b-=2;
		}
		
		
		System.out.println("\n============For문으로 처리============");
		for ( b= 100 ; b > 0 ;b-=2 )
		{
			System.out.println(b+ " ");
		}
		
		
		System.out.println();
		System.out.println("==============while 에서 무한 루프===============");
		
		boolean ab = true;
		int d = 0;	//기본 자료형은 반드시 초기 값이 할당 되어 있어야한다. 
		while (ab) 
		{
			System.out.println(" 무한 루프 ");
			
			if (d > 100) 
			{
				break;
			}
			d++;
		}
		System.out.println("while 문 빠져나옴");
			
		}
		

	

}
