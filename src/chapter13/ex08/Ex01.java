package chapter13.ex08;

interface Animal {
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal을 구현한 Inner클래스를 생성후 메소드 출력
// 2. Animal을 익명 클래스로 생성해서 출력
// 3. 객체 메소드에 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
// 4. 객체 메소드에 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 출력

class A {
	
	
	Animal a = new B();
	void abc() {
		a.cry();
		a.fly();
	}
	
	class B implements Animal {
		@Override
		public void cry() {
			System.out.println("울어도 돼");
			
		}@Override
		public void fly() {
			System.out.println("날아가도 돼");
			
		}
	}
	
}


class B {
	
	Animal aa = new Animal() {
		@Override
		public void cry() {
			System.out.println("울어도 돼 . 익명 클래스");
			
		}@Override
		public void fly() {
			System.out.println("날아가도 돼 . 익명 클래스");
			
		}
	};
	
	void bbb() {
		aa.cry();
		aa.fly();
	}
	
}


class C {
	void ccc(Animal c) {
		c.cry();
		c.fly();
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("=====Inner 클래스 생성후 메소드 출력======");
		A a = new A();
		a.abc();
		
		

		System.out.println("=====익명 클래스 생성 후 출력=========");
		
		B b = new B();
		b.bbb();
		
		System.out.println("======인풋 매개변수로 출력============");
		
		
		C c = new C();
		
		Animal a2 = new Animal() {
			@Override
			public void cry() {
				System.out.println("울어도 돼. 매개변수");
				
			}@Override
			public void fly() {
				System.out.println("날아가도 돼. 매개변수");
				
			}
		};
		
		c.ccc(a2);
		
		System.out.println("=========인풋 매개변수로 받고 참조 변수 없이 출력");
		
		c.ccc(new Animal() {
			@Override
			public void cry() {
				System.out.println("울어도 돼. 참조변수 x");
				
			}@Override
			public void fly() {
				System.out.println("날아가도 돼. 참조변수 x");
				
			}
		});
		

	}

}
