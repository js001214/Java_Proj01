package chapter09.ex03;

class C {
	int a = 10;			//인스턴스 필드 : 객체화 해서 사용 가능, 다른 객체와는 공유되지 않는다.
							//메모리의 Heap 공간에 변수와 값을 저장
	static int b = 20;	//정적 필드 : 객체화 하지 않고 사용 가능
							//모든 객체에서 공유되는 변수
						 //메모리의 클래스 영역에 변수의 값을 저장, Heap 영역에는 
						 //클래스 영역의 저장된 주소값만 가진다.
	void print1(){
		System.out.println(a+ " " + b);
	}
	
	static void print2 () { // static(정적) 메소드에는 인스턴스 필드(a)가 올 수 없다.
		
		System.out.println(b);
	}
}

public class Instance_VS_Static02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		C c1 = new C();
		//객체 필드의 값 수정
		c1.a =100;					//인스턴스 필드 : 자신의 객체에만 적용. 다른 객체와는 공유 되지 않는다.
		c1.b =777;					//정적 필드 :  다른 객체와 서로 공유되는 공간 
		
		System.out.println(c1.a);	//100
		System.out.println(c1.b);	//777
		
		System.out.println(C.b);
		
		System.out.println("=====================================");
		
		C c2 = new C();
		System.out.println(c2.a);	//10
		System.out.println(c2.b);	//20 ==>777
		
		System.out.println("=======================================");
		C c3 = new C();
		
		c1.a = 888;
		c2.a = 999;					//인스턴스 필드는 c2 객체에만 들어간다. c1에는 공유 하지 않는다.
		c3.a = 777;
		c1.b = 111;
		C.b =333;
		
		System.out.println("======================================");
		System.out.println(c1.a);	//인스턴스 필드 : 다른 객체와 분리된 고유공간	
		System.out.println(c2.a);	//인스턴스 필드 : 
		System.out.println(c3.a);
		System.out.println(c1.b);
		System.out.println(c2.b);	//111 static b는 모든 공간에서 공유된다.
		System.out.println(c3.b);	//111
		

	}

}
