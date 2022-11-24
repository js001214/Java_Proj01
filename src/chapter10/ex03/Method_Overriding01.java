package chapter10.ex03;

class A{	//부모 클래스 (super class)
	void print() {	//static이 붙어있지 않은 인스턴스 메소드이다.//인스턴스 메소드일때 오버라이딩이 가능하다.
		System.out.println("A클래스의 print()");
	}
}
class B extends A{	//자식 클래스 (child class)
	@Override//@ :어노테이션, @Override :부모의 메소드를 재정의시 오류를 방지하는 어노테이션
	void print() {
		System.out.println("B클래스의 print()");
	}
}


public class Method_Overriding01 {

	public static void main(String[] args) {
		/* 
		 Method Overloading : 동일한 이름의 메소드를 시그니처에 따라서 다르게 식별(메소드, 생성자) 
		 	시그니처 : 인풋 매개변수의 개수, 타입
		 Method Overriding 	: 부모 클래스의 매소드를 자식 클래스에서 재정의해서 사용하는것 
		 	<인스턴스 메소드>
		 
		 */
		
		//1. A타입 / A생성자 호출
		
		A aa = new A();
		aa.print();			// A클래스의 print()
		
		//2. B타입 / B생성자 호출
		B bb = new B();
		bb.print();			// B클래스의 print()
		
		//3. A타입 / B생성자 호출
		
		A ab = new B();		//B라는 객체를 만들고 타입을 A로 뒀을때 오버라이딩된 
		ab.print();			// B클래스의 print()

	}

}
