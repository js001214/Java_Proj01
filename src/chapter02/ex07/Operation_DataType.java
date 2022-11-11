package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연상 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5 ; //8
		int value2 = 8/5 ; //1 double로 지정하면 1.6
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0;
		System.out.println(data2);		//1.6
		
		double data3 = 8/5 ;		//정수끼리 나눠서 나눔값에서 정수인 1.0만 나옴 // int끼리 나눠서 int가 값이 나왔어~
		System.out.println(data3);
		
		double data4 = 8/5.0;		//정수 8이 자동으로 double 형으로 업캐스팅이 일어나서 연산
		System.out.println(data4);		//1.6
		
		//주의 : 평균을 계산 할때 double형으로 // 왜냐하면 소숫점도 중요하니까 int보단 double로~
		
		System.out.println("==================================");
		
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 = 5 + 3.5; //오류 발생! 왜냐하면 3.5는 실수라서 정수보다 더 큰건데 정수 자료형 int로는 실수 자료형을 품을 수는 없거든
							 //5는 3.5때문에 5.0으로 업캐스팅이 되고 8.5가 돼서 double로 주거나 (int)5 + (int)3.5를 해서 int값으로 줘도 돼
		double data6 = 5 + 3.5 ; //5 가 5.0 + 3.5로 업캐스팅이 돼
		
		int data7 = 5 + (int)3.5; //8 // (int)3.5로 3으로 만들어주고 5+3해서 8이나와!
		int data8 = (int) (5 + 3.5); // (5 + 3.5)끼리 업캐스팅 돼서 8.5가되고 int를 이용해 8로 가져와서 자료형 int로 다시 받아
				
		double data9 = 5/2.0; //5가 double형으로 바뀌어서 5.0/2.0이돼! 그래서 결국엔 double형 3.0으로 출력 돼
		
		System.out.println(data9); //2.5
		
		double data10 = 5/2;
		System.out.println(data10); //2.0 5/2가 double형으로 업캐스팅 돼서 5.0/2.0
		
		System.out.println("=====================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11+data12); //data11은 int data12는 double인데 double형으로 업캐스팅이 돼서 83.33으로 나온다
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11/data12); //double형으로 출력
		//다운캐스팅 : data11 (double) ==> data12(int)
		System.out.println(data11/(int)data12);  //int형으로 출력
		
		
		// <문제>
		// 국어 : 90, 수학 :88, 영어 : 77, 음악 : 90, 과학 : 99
		// 각 점수를 정수형 변수int에 담고 합계(sum), 평균 (avg) 값을 출력 
		
		
		int a=90;
		int b=88;
		int c=77;
		int d=90;
		int e=99;
		int sum = a+b+c+d+e;
			double avg = sum / 5.0;  //5로 나누지 말고 5.0으로 나누어야한다.
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		

	}

}
