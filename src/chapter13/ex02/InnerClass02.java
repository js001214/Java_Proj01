package chapter13.ex02;

//이너 클래스에서 외부 클래스의 필드와 메소드 접근

//메소드 오버라이딩 :	1. 반드시 상속 관계가 있어야한다.
//				2. <인스턴스 메소드> 오버라이딩
//				3. 인스턴스필드, 정적필드 , 정적 메소드는 오버라이딩 되지 않는다.

class A {		//Outer Class
	//필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;

	//메소드 : 중복 메소드
	void abc() {	//오버라이딩 되지 않는다.
		System.out.println("A클래스의 메소드 abc()");
	}
	
	void def() {
		System.out.println("A 클래스의 메소드 def()");
	}
	//이너클래스
	class B{
		//이너 클래스 필드
		int a = 5;
		int b = 6;
		
		//이너 클래스의 메소드 : 중복 메소드
		void abc() {	//오버라이딩 되지 않는다.
			System.out.println("B클래스의 abc()");
		}
		void bcd() {
			//필드의 값 호출
			System.out.println(a);	//this.a //5
			System.out.println(b);	//this.b //6
			System.out.println("===============================");
			
			//이너 클래스에서 Outer 클래스의 필드 호출
			System.out.println(A.this.a);	//Outer Class A의 필드 : 3
			System.out.println(A.this.b);	//Outer Class B의 필드 : 4
			
			//메소드 호출 : 중복된 메소드 호출
			abc();			//this.abc() 이너 클래스의 메소드
				
			A.this.abc();	//아웃터 클래스의 abc()
			
			//이너클래스와 아웃터 클래스에서 중복 되지 않는 필드 호출
			System.out.println("==================================");
			System.out.println(c);	//아웃터 클래스의 필드 : 
			System.out.println(d);	//중복이 되지 않는 것은 바로 호출 가능
			
			//외부에 중복 되지 않는 메소드 : 
			def();
		}
	}
}

public class InnerClass02 {

	public static void main(String[] args) {
		
		//1. 외부 객체 생성
		
		A a = new A();
		
		//2. 내부 객체 생성
		A.B b = a.new B();
		
		b.bcd();

	}

}
