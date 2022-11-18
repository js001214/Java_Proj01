package chapter07;

class Calc{
	//사칙 연산을 처리하는 메소드
	//두 정수으 ㅣ값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {

		return a+b;
	}
	
	int diff (int a , int b)
	{
		return a-b;
	}
	int mul (int a , int b)
	{
		return a*b;
	}
	double div (int a, double b)
	{
		return a/b;
	}
	double Rec (int a, double b)
	{
		return a*b;
		
	}
	
	// 빼기 (diff)
	//곱하기 (mul)
	//나누기(div) : double
	//면적 (Rec) (가로 : x 세로 :y ) double 두개를 받아서 면적 구하기
}

public class Ex01 {

	public static void main(String[] args) {
		
		Calc m = new Calc();  //Calc클래스를 불러오려면 Calc(class이름) m(매개변수)  = new Calc(class이름); 을 해줘야한다.
		
		
		int a = m.add (4,6);
		System.out.println(a);
		System.out.println(m.add(4, 6));
		int b = m.diff (4,6);
		System.out.println(b);
		System.out.println(m.diff(4, 6));
		int c = m.mul (4,6);
		System.out.println(c);
		System.out.println(m.mul(4, 6));
		
		double d = m.div(4,6);
		System.out.println(d);
		System.out.println(m.div(4, 6));
		double e = m.Rec(4,6);
		System.out.println(e);
		System.out.println(m.Rec(4, 6));
		
	}

}
