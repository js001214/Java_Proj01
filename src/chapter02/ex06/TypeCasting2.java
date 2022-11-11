package chapter02.ex06;

public class TypeCasting2 {

	public static void main(String[] args) {
		// 자동 타입 변환(업캐스팅) vs 수동 타입 변환 (다운캐스팅)
		//1. 자동 타입변환 (업캐스팅 : 낮은 자료형에서 높은 자료형으로 자동으로 변환)
			// byte  short int long float double(올라갈수록 높은 자료형)
		
		float value1 = 3; //int => float 으로 업캐스팅 되어 들어감
		long value2 = 5;  //int => long으로 자동으로 업캐스팅
		double value3 = 7; //int => double으로 자동으로 업캐스팅
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("====================");
		
		//2. 수동으로 타입 변환 (다운 캐스팅 : 높은 자료형에서 낮은 자료형으로 변환)
		int value4 = (int)3.5;	//double => int (다운캐스팅)   3.5 는 double실수형이라 int로 출력하려면 int로 다운캐스팅 해줘야함
		float value5 = 7.8f; 	//double 이 기본실수형이기 때문에 double을 float으로 다운캐스팅 해줘야한다.
				System.out.println(value4);
				System.out.println(value5);
				
		
	}

}
