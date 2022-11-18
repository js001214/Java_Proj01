package chapter07;

class MethodOverloading {
	
	//메소드 오버로딩의 위배 //위의 메소드 print도 double과 int형으로 받기 때문이다. 하지만 둘 중 하나가 int,double의 위치가 바뀌면 위배가 아니다.
		//void print(double c, int k) {
			
		//}
	
	
	
	//메소드 오버로딩 : 동일한 이름의 메소드이지만 시그니쳐에 따라서 다른 메소드를 호출하는것
		// 시그니쳐 : 매개변수 개수, 매개변수의 데이터 타입 <==
	void print() { //print라는 method인데 void라서 인풋 매개변수가 없는 메소드이다.
		System.out.println("데이터가 없습니다.");
	}
	void print(int a) { //print(int a) :인풋 매개변수(int a)에 정수1개를 인풋 받는 메소드 
		System.out.println("int" + a);
	}
	void print(double a) {
		System.out.println("double"+a);
	}
	void print(int a, int b) {
		System.out.println("int 2개 : " + a + " " + b);
	}
	void print(double a, int b)
	{
		System.out.println("double 1개, int 1개"+a+" "+b);
	}
	
	
	void print(int c, double k) {
		//시그니쳐 중복 항목이 없다.
	}
	//메소드 오버로딩의 위배
	//void print(int a, double b)
}
public class Method_Overloading {
	public static void main(String[] args) {
		//※ 메소드 오버로딩 : 동일한 이름의 메소드를 시그니쳐에 따라서 다른 메소드를 호출하는 것
		//※		시그니쳐 : 메소드의 인풋 매개변수 갯수 , 인풋 되는 타입이다를 경우 다른 메소드로 식별
		//※메소드 오버라이딩 : 상속 에서만 적용됨
			//※부모클래스에서 서넌된 메소드를 자식클래스에서 재정의해서 사용하는것

		
		MethodOverloading mo =new MethodOverloading(); //객체화
		
		//1. 매개변수가 없는 메소드 호출
		mo.print();
		//2. 매개변수가 1개인 정수
		mo.print(10);
		//3. 매개변수가 1개인 실수
		mo.print(50.0);
		//4. 매개변수가 2개인 정수
		mo.print(30,70);
		//5. 매개변수가 2개인 실수
		mo.print(55.5,40);
		
	}

}
