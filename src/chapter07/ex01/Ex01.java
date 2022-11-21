package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {			//객체 생성, 메소드 호출은 main 메소드에서 해야해!!
														//a, b는 static이 있기 때문에 객체 없이 바로 호출 가능하다.
		
		// 정수값 3개를 인풋 받고 더한 값을 정수로 리턴하는 메소드 (static 사용)
		
		// 실수 3개를 인풋 받아 더한 값을 실수로 리턴하는 메소드 (static 사용)
		
		// 문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드
		 // "제품이름" , "제품 수량" , "제품 가격"
	
	abc (3,3,3);
	int a = abc(3, 3, 3);
	System.out.println(a);
	
	
	System.out.println(abc(4,4,4));
	
	
	
	System.out.println("===========================");
	
	
	double b = abc1(3.0, 3.0, 3.0);
	System.out.println(b);
	System.out.println(abc1(3.0, 3.0, 3.0));
	
	
	//String c = abc2("삼성", "19개" , "1만원")으로 바로 적으면 오류가 난다.
	Ex01 p = new Ex01 ();		//static을 쓰지 않았기 때문에 객체화를 해줘야한다.  Ex01(클래스 이름) p(매개 변수) = new(Heap공간에 저장) Ex01();
	String c = p.abc2("삼성\t", "19개\t", "1만원\t");	// String c에 담아준다.
	System.out.println(c);
	
	System.out.println(p.abc2("삼성\t", "19개\t", "1만원\t"));
	}

	
	public static int abc (int a, int b, int c) //정수로 abc를 받고 정수로 리턴
	{
		return a + b + c;
	}
	
	public static double abc1 (double a, double b, double c)
	{
		return a + b + c;
	}
	
	public String abc2 (String a, String b, String c) //static을 쓰지 않았기 때문에 객체화를 해줘야한다
	{
		return a + b + c;
	}
	
	
	
}
