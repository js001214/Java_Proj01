package chapter10.ex07;

class A{
	A(){ System.out.println("A 생성자");}
}
class B extends A{
	B(){
		super();	//생략되어있다. 컴파일러가 자동으로 추가해줌
		System.out.println("B 생성자");
	}
}
class C{
	C(int a) {
		System.out.println("C 생성자");
	}
}
class D extends C{
	D(){
		super(3);	//상속받는 클래스의 매개변수에 3을 넣는다.
		System.out.println("D 생성자");
	}
}

public class Super_Method {

	public static void main(String[] args) {
		// super Method : 부모클래스의 생성자 호출
		//		- 자식 클래스 생성자는 기본적으로 super(), 부모 클래스의 기본 생성자 호출
		
		//1. A객체 생성
		A aa = new A();	//A 생성자
		System.out.println("======================================");
		
		//2. B객체 생성
		B bb = new B();	//B 생성자	//A생성자 먼저 찍히고 B생성자가 찍힌다.
		System.out.println("======================================");
		
		//3. D객체 생성
		D dd = new D();
	}

}
