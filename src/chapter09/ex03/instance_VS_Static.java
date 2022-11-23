package chapter09.ex03;


class A {
	int a = 1;		//인스턴스 필드 : 객체를 생성후 사용가능
	int b = 2;		//인스턴스의 값은 Heap영역에 저장된다.
	
	void print() {		//인스턴스 메소드 : 객체를 생성해야지만 사용 가능
		System.out.println(a + " " + b);
	}
	
}

class B {
	static int a = 3;	//static(정적) 필드 : 객체 생성없이 클래스 이름으로 호출가능, 객체 생성후도 사용 가능//static은 Heap역역이 아니라 클래스에 저장된다.
	static int b = 4;	
	
	static void print()	//static(정적) 메소드 : 
	{
		System.out.println(a + " " + b);
	}
	
	
	
}

public class instance_VS_Static {

	public static void main(String[] args) {
		//
		// A class 는 인스턴스 필드, 인스턴스 메소드 <==객체화 해서 사용가능
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.print();
		
		//B class는 Static (정적) 필드, 정적 메소드	<==	 클래스 이름으로 사용가능, 객체 생성후에도 사용가능
		
		//객체 생성 없이 클래스 이름으로 필드와 메소드 호출
		System.out.println(B.a); 
		System.out.println(B.b);
		B.print();
		
		//객체 생성후 필드와 메소드 호출

		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.a);
		
		b1.print();
	}

}
