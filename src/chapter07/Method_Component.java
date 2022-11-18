package chapter07;

class Method
{
	//필드는 생략
	//생성자 생략
	
	//1. 리턴타입 : void + 매개변수가 없는 메소드
	void print()
	{
	System.out.println("안녕");
	}
	
	//2. 리턴타입 : int +매개변수가없는 메소드
		// return은 메소드를 호출시 돌려주는 값
	int data() //data앞에 int로 리턴을 주겠다 했기 때문에 return 정수형으로 줘야한다.
	{
		int a;
		a= 3; //int형 메소드에는 리턴은 정수가 와야한다.
		return a;
	}
	
	//3. 리턴타입 : double + 매개변수가 2개인 메소드
	double sum(int a, double b) { //sum이라는 메소드를 호출할때 첫번째 값은 정수 , 두 번째 값은 double형으로 // 매개변수 두개를 반드시 호출해야한다.
		return a + b; // a에는 int형 할당 ,b에는double형 할당 하지만 리턴할때 double형으로 업캐스팅된다.
	}
	
	//4. 리턴타입 : void + 내부에 리턴 포함(함수를 종료한다는 의미)
	void printMonth(int m )
	{
		if ( m < 0 || m > 12)
		{
			System.out.println("잘못된 입력입니다.");
			return; //void로 선언된 메소드내에서 return을 사용하면 메소드를 종료
		}
		System.out.println(m + " 월 입니다. ");
	}
}

public class Method_Component {

	public static void main(String[] args) {
		/* Method ( 메소드 ) : 실행블락에 프로그램 기능을 저장
			-호출시 작동,
			-메소드 이름 앞에 리턴파입이 무조건 존재해야한다.
			void : 리턴파일이 존재하지 않을때
			int  : 정수 값을 리턴
			boolean : true, false를 리턴
			.....double, char,
			String : 문자열을 리턴
			
		
		*/
		//1. 객체 생성 : class ==> Object(Instance) /class는 hdd같은 느낌이고 object(Instance)라는 memory에 넣는 느낌
		Method m = new Method();
		
		//2. 메소드 호출 : m.메소드명
		m.print();
		
		int k = m.data();		//data()를 호출하는 순간 정수 3값이 리턴
		System.out.println(k);	
		
		
	double l= m.sum(50,60.6); //두개의 매개변수를 줘야한다. 50 . 60.6
		System.out.println(l);
		
		m.printMonth(3);
		m.printMonth(30);
	}

}
