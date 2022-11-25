package chapter10.ex10;

class C {
	String stuID;
	String name;
	int age;
	//c1.equals(c2)를 넣었을때 stuID가 같으면 true or false
		//생성자,기본생성자1, 생성자2
		//toString 메소드 재정의 : 필드의 값을 출력, 객체 
	
	
	C(String stuID, String name,int age){
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
	@Override			// (b2)가 obj에 들어간것 b2객체, Object타입으로 업캐스팅해서 들어옴
	public boolean equals(Object obj) { 	//Object 타입으로 업캐스팅해서 들어옴.
		if (this.stuID == ((C)obj).stuID){	//this.name은 b1객체의 name필드(안녕) == Bb객체로 다운 캐스팅하고 name은 b2의 name 필드 (안녕)
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C c1 = new C("안녕");
		//C c2 = new C("안녕");
		
		//System.out.println(c1.equals(c2));
		////equals () 메소드를 재정의 해서 Heap 값을 비교 하도록 설정
		//System.out.println(c2.equals(c3));	//Heap, name 필드의 값을 비교하도록 재정의
			//true
	}

}
