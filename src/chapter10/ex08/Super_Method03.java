package chapter10.ex08;
class A{
	A(){
		this(3); //자신 객체의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}

class B extends A{
	B(){
	this(3);						//자식의 생성자 첫번째 라인에는 super(), this()둘 중 하나는 무조건 와야한다.
	System.out.println("B 생성자 1");
	}
	
	B(int a){
		//super(); 의 기본 생성자가 생략
		System.out.println("B 생성자 2");
	}
}

public class Super_Method03 {

	public static void main(String[] args) {
		//
		
		//1. 객체 생성후 출력
		A aa1 = new A();	//this(3) 호출  --> A(int a) 호출, 생성자 2를 찍고나서 1이 찍힌다.
		
		//2.
		A aa2 = new A(3);	// 정수값 들어가는 int a 를 호출하는 것 // A생성자 2
		System.out.println("=================================================");
		
		//3 B
		
		B bb1 = new B();	//this(3) 호출 , B(int a) 호출, A(){}호출, A(int a) 호출
		//A 생성자 2, A 생성자 1, B 생성자 2, B 생성자 1
		System.out.println("================================================");
		
		B bb2 = new B(3);	//super() 때문에 A 생성자2,1찍히고 B생성자2가 찍힌다.
	}

}
