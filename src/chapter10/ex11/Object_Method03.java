package chapter10.ex11;

import java.util.HashMap;

class A{	// equals() 메소드만 재정의 된 상태, hashcode() 재정의 되지 않은 상태
			// 
	
	//필드
	String name;
	//생성자
	A(String name) {
		this.name = name;
	}
	//equals() 재정의
	@Override 										
	public boolean equals(Object obj) { 
		if(this.name == ((A)obj).name) { //this.name은 a1 //obj를A타입으로 다운캐스팅  obj.name은 a2
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
}
class B{	//equals(), hashCode() 메소드 2개를 재정의 함.
	//필드
		String name;
		//생성자
		B(String name) {
			this.name = name;
		}
		//equals() 재정의
		@Override 										
		public boolean equals(Object obj) { 
			if(this.name == ((B)obj).name) { //this.name은 a1 //obj를A타입으로 다운캐스팅  obj.name은 a2
				return true;
			}else {
				return false;
			}
		}
		@Override		//
		public int hashCode() {
			return name.hashCode();
		}
		
		@Override
		public String toString() {
			return "B [name=" + name + "]";
		}
}



public class Object_Method03 {

	public static void main(String[] args) {
		// HashMap : key : Value <== 컬랙션
			// Key는 중복된 데이터를 넣을 수 없도록 하는 자료 구조,
			// equals(), hashCode();
		HashMap <Integer,String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");	//
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		
		System.out.println(hm1);
		
		// Integer : equals(), hashCode() 메소드가 재정의 되어 있기 때문에 Map 자료 구조의 Key로 사용 할 수 있다.
		
		// 자신이 만든 객체를 Map의 Key로 사용 할 수 있다.
		// equals(), hashCode()를 재정의 해야 Map의 Key로 사용 할 수 있다.
		
		System.out.println("========================================");
		HashMap<A,String> hm2 = new HashMap<>();
		// A 클래스는 equals() 재정의, hashCode()가 재정의가 안 되어있기 때문에 Map의 Key로 사용이 불가능하다.
		hm2.put(new A ("첫번째"), "데이터1");	//해시코드를 재정의 안해줘서 중복된 Key가 들어갔다.
		hm2.put(new A ("첫번째"), "데이터2");
		hm2.put(new A ("두번째"), "데이터3");
		 
		System.out.println(hm2);
		
		System.out.println("====================================");
		
		HashMap <B, String> hm3 = new HashMap<>();
		//B 클래스 : equals(), hashCode() 재정의가 되어있기 때문에 Map의 Key로 사용할 수 있다.	
		hm3.put(new B("첫번째"),"데이터1");
		hm3.put(new B("첫번째"),"데이터2");
		hm3.put(new B("첫번째"),"데이터4");
		hm3.put(new B("두번째"),"데이터3");
		System.out.println(hm3);
	}

}
