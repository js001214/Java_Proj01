package chapter04.ex03;

public class For_Statement03 {

	public static void main(String[] args) {
		// for 문 내의 for문 : 2중 for문
		// for 문을 사용해서 구구단 출력
		
		
		// 바깥쪽 For문은 단을 출력
		// i * j == i*j
		for (int i= 1; i < 10; i++) {
			
			//
			System.out.println(i + " 단 출력 ");
			for (int j = 1; j< 10 ; j++) {
				System.out.println(i + " * "+ j +" = " + i*j);
			}
			System.out.println();
		}
		
	}

}
