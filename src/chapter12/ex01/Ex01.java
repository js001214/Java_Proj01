package chapter12.ex01;

//완료 시간 : 11시 40분까지
abstract class Calc {	//사칙 연산을 계산하는 계산기 클래스
	
	Calc (){}
	
	 abstract int add(int a, int b);		//	더하기 연산
	 abstract int diff(int a, int b);	//	뺄셈
	 abstract int mul(int a, int b);		//	곱하기
	 abstract double div (int a, int b);	// 	나누기
	
}


class Calc_Impl extends Calc{	//Calc를 구현한 클래스
	
	
	@Override
		int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	
	
	@Override
		int diff(int a, int b) {
			// TODO Auto-generated method stub
			return a-b;
		}
	@Override
		double div(int a, int b) {
			// TODO Auto-generated method stub
			return (double)a/(double)b;
		}
	@Override
		int mul(int a, int b) {
			// TODO Auto-generated method stub
			return a*b;
		}


	
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		Calc c1 = new Calc_Impl(); 
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.mul(a, b));
		System.out.println(c1.div(a, b));
		
		
		Calc c2 = new Calc() 
		{
			
			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
				return a+b;

			}
		@Override
			int diff(int a, int b) {
				// TODO Auto-generated method stub
			System.out.println(a-b);
				return a-b;
			}
		@Override
			double div(int a, int b) {
				// TODO Auto-generated method stub
			System.out.println(a/b);
				return a/b;
			}
		@Override
			int mul(int a, int b) {
				// TODO Auto-generated method stub
			System.out.println(a*b);
				return a*b;
			}
		
			
		};
		c2.add(a, b);
		c2.diff(a, b);
		c2.div(a, b);
		c2.mul(a, b);
	}

}
