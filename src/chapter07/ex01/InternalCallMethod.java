package chapter07.ex01;

public class InternalCallMethod {

	//main 메소드는 static이 붙어 있는 메소드
	public static void main(String[] args) {
		// 클래스 내부에서 다른 메소드 호출
			//main 메소드는  메소드 이름 앞에 public이 있다. public은 다른 패키지에서 호출이 가능하다.
			//static은 인스턴스화 없이도 사용이 가능하다. 다른 말로는 객체를 생성하지 않고 사용 가능하다.
	
		//print 메소드 호출 (객체 생성 없이 바로 호출이 가능)
		print();
		System.out.println("========================");
		
		//twice(33);
		int ab = twice(33);		//twice (int k)
		System.out.println(ab);
		System.out.println(twice(22));
	
		System.out.println("========================");
		
		//sum 메소드 호출
		double bc = sum(4, 5.0);
		System.out.println(bc);
		System.out.println(sum(8, 11.5));
		
		//sum2는 바로 호출시 오류가 발생 <== 객체화 해서 호출
		//double de = sum2(20,33.3);	//객체화 하지 않아서 오류가 발생
		
		
		//sum2 메소드 호출 : 인스턴스 메소드(객체화 해야 사용 가능)
		InternalCallMethod p1 = new InternalCallMethod();
		double cd = p1.sum2(33, 44.4);
		System.out.println(cd);
	
		
	
	}
	
	
	// 메소드 이름 앞에 static 키를 넣으면 객체 생성 없이 호출이 가능함.
	public static void print() {
		System.out.println("안녕");
	}
	
	//정수 k를 인풋 받고 인풋 받은 k값에 2를 곱해서 정수로 리턴한다.
	public static int twice(int k) { 
		
		return k*2;
	}
	public static double sum (int m , double n){ //int sum으로 할거면 return m + n가 아닌 return m+(int)n;으로 다운캐스팅 해줘야한다.
		
	return m + n ;
	}
	
	// static 키 없이 메소드 생성 : static 키가 없는 메소드를 인스턴스 메소드라 한다.(반드시 객체화 시켜야한다.)
	public double sum2(int m, double n)
	{
		return m + n;
	}
}