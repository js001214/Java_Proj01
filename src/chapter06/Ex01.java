package chapter06;

class Man
{
	String name = "홍길동";
	int age = 30 ;
	String phone = "010-1111-1234";
	String addr="서울 종로구 인사동";
	double weight=70.5;
	
	//기본 생성자는 생략됨 A() {}
	
	//메소드(함수):
	void add1() 
	{
		
		
		// 1 ~ 100 까지 2의 배수를 출력하고 2의 배수를 더한값을 
		
		int x, sum;
		sum = 0;
		for(x=1;x<=100;x++)
		{
		if (x%2==0) {
		    sum = sum + x;
		System.out.print(x + " ");
		}
		
		
		
	}
		System.out.printf("1부터 100사이의 모든 2의배수의 합은 %d입니다.\n", sum);
	}
				
	
		
	
	void add2() 
	{
		// 1 ~ 500까지 3의 배수와 4의 배수 출력하고 더한값 출력	
		
		int x2, sum2;
		sum2 = 0;
		for(x2=1;x2<=500;x2++)
		{
		if ( x2 % 3 == 0 || x2 % 4 == 0)
		{
		 sum2+=x2;
		}
		}
		System.out.printf("1부터 500사이의 3의배수와 4의배수의 합은 %d입니다.\n", sum2);
	}
	
	void add3() 
	{
		int x3, sum3;
		sum3=0;
		for (x3 = 1; x3<=1000;x3++  )
		{
			if(x3%4!=00)
			{
				sum3+=x3;
			}
				
		}
		System.out.printf("1부터 1000사이의 4배수만 출력되지 않은 합은 %d입니다. \n", sum3);
		
		// 1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록
	}
 	
}



public class Ex01 {

	public static void main(String[] args) {
		Man a = new Man();
		a.add1();
		a.add2();
		a.add3();
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.phone);
		System.out.println(a.addr);
		System.out.println(a.weight);

	}

}
