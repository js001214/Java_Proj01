package chapter02.ex05;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (캐스팅)
		//1. 캐스팅 방법 1
		
			//정수의 기본은 int 형으로 저장됨
		
		int value1 = (int)5.3;		//value1 정수 값만 넣을 수 있다. //5.3이라는 실수를 int형으로 바꾸라는 의미
		long value2 = (long)10.232;	// 정수는 기본적으로 int기 때문에 (long)을 넣어서 long형으로 만든다.
		
			//실수의 기본은 double
		float value3 =(float) 5.8;	//캐스팅이 필요해서 앞에 (float)를 해주거나 5.8F로 해줘야한다.
		double value4 = 10.50;		//실수의 기본은 double이라 따로 캐스팅을 안 해줌
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4); 
		
		System.out.println("========================");
		
			//2. 캐스팅 ( l, L  / f, F ) : long, float
				//long, float의 정의된 변수에 값을 할당 할때 캐스팅 해서 넣어야 한다.
				// 정수 : int, 실수 : double
		long value5 = 10L; 
		long value6 = 20l;
		
		float value7 = 5.8f;
		float value8 = 5.8F;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}

}
