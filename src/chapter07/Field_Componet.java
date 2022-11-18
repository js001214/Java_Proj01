package chapter07;

class A //A클래스 : 객체를 생성하기위한 틀.
{
	//필드 : 객체를 생성시 Heap 영역에 필드의 값이 저장됨
		//Heap 변수[필드]의 값이 비어 있을 강제 초기화
	int a;		//0   기본적으로
	boolean b;	//false
	double c;	//0.0
	String d;	//null
	
	//생성자: A(){} :기본생성자 생량됨
	
	//필드의 기본값을 출력하는 메소드
	void defaultValue ( ) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B		//클래스 //필드//메소드//
{
	//필드 선언한 변수 값들은 Heap에 저장
	int m =3;
	int n =4;
	
	//기본 생성자는 생략 : B(){}
	
	//메소드 선언
	void work1()
	{
		int k = 5;	//메소드 내부에서 저장된 지역변수는 stack에저장
		System.out.println(k);
		work2(3); //같은 클래스에 있는 메소드 호출 //매개변수3 //work2를 호출하면서 3이 int i에 꼭 들어가야한다.
	}
	void work2 (int i) // 
	{
	int j = 4; //지역변수
	System.out.println(i+j);	//7
	}


}

public class Field_Componet {

	public static void main(String[] args) {
		// 클래스 내부 구성요소.
		// - Field : 필드
		// - Method : 메소드
		// - Constructor : 생성자
		
		//메소드 내부에서 선언된 변수의 값은 stack
		int e; //메소드 내부에서 선언된 변수는 Stack에 변수와 값이 저장됨.
		
		//1.객체 생성
		A abc = new A();	// new A() : 기본생산자 호출
		
		abc.defaultValue(); // 메소드 호출
		
		System.out.println("=================================");
		
		A bcd = new A();
		bcd.defaultValue();
		
		
		System.out.println("=================================");
		B b = new B(); 
		b.work1();
		
	}

}
