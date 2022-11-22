package chapter07.ex05;

class A {
	//필드: 필드는 Heap 영역에 저장
	int m;
	int n;
	
	//메소드 : 정수 값 2개, this 키를 생략한 경우
	void init(int a, int b) {	// 메소드 내의 : a, b, c <==지역 변수,
		int c;
		c = 3;
		m = a;		//this.m 이 기본적으로 생략되어 있다. //인풋매개 변수, 실행블락에 할당매개 변수, 필드에 보내는 변수가 동일하면 this.을 명시해야한다. 
		n = b;		//this.n 이 기본적으로 생략되어 있다.
	}
	//this 키를 명시해야하는 경우
	void init2(int m, int n) {
		this.m = m;
		this.n = n;
		
	}
	
	//메소드
	void work( ) {
		this.init(2,3);		//this 자기자신 객체의 필드나 메소드 호출
		System.out.println(m + " " + n + " ");
	}
	
}



public class This_Keyword {

	public static void main(String[] args) {
		// this는 자기 자신 객체의 필드나 메소드를 뜻한다  <== 필드 , 메소드에 적용
		// this() //괄호가 있으면 메소드 : 자신객체의 다른 생성자 호출시 사용
		// super 는 상속에서 부모의 객체의 필드나 메소드를 사용 할 때 사용
		// super() : 부모 클래스의 생성자 호출 할 때 사용
	
	
	A a = new A();
	a.work();
		
	}

}
