package chapter12.ex01;

abstract class Calc2 {
	abstract void add(int a, int b);		//	더하기 연산
	 abstract void diff(int a, int b);	//	뺄셈
	 abstract void mul(int a, int b);		//	곱하기
	 abstract void div (int a, int b);	// 	나누기
	
	
	 
	 
}

class Calc_Impl2 extends Calc2{		//return이 없을때는 출력구문만 만들어서 void 메소드를 호출할때 바로 찍어 줄 수 있도록 한다.
	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		 System.out.println(a+b);
		
	}@Override
	void diff(int a, int b) {
		// TODO Auto-generated method stub
		 System.out.println(a-b);
		
	}@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		 System.out.println(a/b);
		
	}@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		 System.out.println(a*b);
		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		Calc2 c2 = new Calc_Impl2();
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
		
		
		System.out.println("==========객체 지정 없이============");
		
		Calc2 c3 = new Calc2() 
		{
			@Override
			void add(int a, int b) {
				// TODO Auto-generated method stub
				 System.out.println(a+b);
				
			}@Override
			void diff(int a, int b) {
				// TODO Auto-generated method stub
				 System.out.println(a-b);
				
			}@Override
			void div(int a, int b) {
				// TODO Auto-generated method stub
				 System.out.println(a/b);
				
			}@Override
			void mul(int a, int b) {
				// TODO Auto-generated method stub
				 System.out.println(a*b);
				
			}
		
		};
		c3.add(a, b);
		c3.diff(a, b);
		c3.mul(a, b);
		c3.div(a, b);
		
		

	}

}
