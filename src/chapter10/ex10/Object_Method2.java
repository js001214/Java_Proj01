package chapter10.ex10;

class Aa{		// equals()가 정의되어 있지 않는 클래스
	//필드1		// Object 클래스의 equals() 메소드는 stack의 참조 주소를 비교하도록 되어있다.
	String name;
	
	//생성자:
	Aa(String name){
		this.name = name;
	}
}

class Bb{		// Object의 equals()를 재정의 해서 Heap의 값비교하도록  설정
	//필드1
	String name;
	
	Bb(String name){
		this.name = name;
	}
	
	@Override			// (b2)가 obj에 들어간것 b2객체, Object타입으로 업캐스팅해서 들어옴
	public boolean equals(Object obj) { 	//Object 타입으로 업캐스팅해서 들어옴.
		if (this.name == ((Bb)obj).name){	//this.name은 b1객체의 name필드(안녕) == Bb객체로 다운 캐스팅하고 name은 b2의 name 필드 (안녕)
			return true;
		}else {
			return false;
		}
	}
	
}

public class Object_Method2 {

	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 :		기본적으로 == 참조 주소를 비교함
 				//객체의 Heap의 값을 비교하는 것이 아니라 stack 메모리의 참조주소 값을 비교.
		// String 클래스는 equals() 메소드가 재정의 되어있어서 Heap값을비교 하도록 설정이 되어있다.
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");			//Heap에 있는 값들은 동일 Stack은 아냐
		// == : 참조 자료형에서는 stack영역의 비교
				// equals() : ==
					//String 클래스는 equals() 메소드가 재정의 : Heap의 값을 비교하도록 설정
				System.out.println(s1 == s2);
				System.out.println(s1.equals(s2)); //Heap의 값을 비교, true
				//String 클래스는 Object의 equals() 재정의 되어있다.
		 
				System.out.println("=======================================");
				Aa a1 = new Aa("안녕");
				Aa a2 = new Aa("안녕");
				System.out.println(a1 == a2); //Stack 참조 주소 비교, false
				System.out.println(a1.equals(a2));	//Stack 참조 주소 비교, false //equals를 재정의 해야돼! true가 나오려면
				
				System.out.println("=======================================");
				Bb b1 = new Bb("안녕");
				Bb b2 = new Bb("안녕");
				
				System.out.println(b1 == b2);
				//equals () 메소드를 재정의 해서 Heap 값을 비교 하도록 설정
				System.out.println(b1.equals(b2));	//Heap, name 필드의 값을 비교하도록 재정의
					//true
	}

}
