package chapter10.ex02;

//클래스의 상속 관계에서 업캐스팅 및 다운 캐스팅
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Type_Casting02 {

	public static void main(String[] args) {
		// 1.업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가, 자식 클래스 객체 생성 ==> 타입을 부모
		A ac = new C();	//ac에는 A,B,C 객체가 다 포함되지만 A클래스에 있는 필드와 메소드만 사용가능
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D); //false
		
		B bc= new C(); //A,B,C를 모두 내포하고 있고 B타임으로 정의, <<A,B접근>>
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D); //false
		
		//bc는 B타입으로 정의,	 A타입으로 업캐스팅
		A a = bc;
		
		//2. 다운 캐스팅(수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생
		//aa는 A만 내포하고 있다.
		A aa = new A();
		System.out.println(aa instanceof A);	//true
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		System.out.println(aa instanceof D);
		
		
		if (aa instanceof B) {
		B ba = (B) aa; //오류가 없다, 실행시 오류
	}else {
		System.out.println("aa는 B를 내포하고 있지 않다.다운캐스팅 불가");
	}
		
		if (aa instanceof C) {
			C ca = (C) aa; //오류가 없다, 실행시 오류
		}else {
			System.out.println("aa는 c를 내포하고 있지 않다.다운캐스팅 불가");
		}
		
		System.out.println("==========================");
		//bd는 ABD를 내포하고 있다. <<A,B접근 가능>> A로 업캐스팅, D로 다운캐스팅 가능
		//
		B bd = new D();
		System.out.println(bd instanceof A);
		System.out.println(bd instanceof B);
		System.out.println(bd instanceof C); //false
		System.out.println(bd instanceof D);
		
		
		
		
		
		
		
		
}
}
