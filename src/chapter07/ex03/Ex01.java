package chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		 
		 values[0]번째 방에 정수 1 ~ 9이 들어왔을때는 "파워레벨 1 ~ 9입니다."
		 values[1]번째 방에 정수 1 ~ 9가 들어왔을때는 "스피드레벨 1 ~ 9입니다."
		  
		  
		
		 */
		arrayFlexible(4,3);
		
	}
	
	public static void arrayFlexible (int...values) {
	
		
		if ( values [0] > 0 && values[0] < 10)
		{
			System.out.printf("파워 레벨 %d 입니다.", values[0]);
		}
		else
		{
			System.out.println("잘못된 입력 입니다. 1~9사이의 값만 넣으세요");
		}
		if ( values [1] > 0 && values[1] < 10)
		{
			System.out.printf("스피드 레벨 %d 입니다.", values[1]);
		}
		else
		{
			System.out.println("잘못된 입력 입니다. 1~9사이의 값만 넣으세요");
		}
		
		
			
		
		
		
		
	}

}
