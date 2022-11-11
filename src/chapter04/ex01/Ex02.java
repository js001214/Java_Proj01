package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.>>
		// IF문을 사용
		
		int select ;	//프로그램을 선택
		
		int kor ;
		int eng ;
		int math ;
		int sum;
		double avg;
		
		int a ; //홀짝을 출력하는 변수
		
		
		
		
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);
		
		
	
		
		System.out.println("==============================================");
		System.out.println("1.학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("=============================================="); //if 학점을 선택하면 {} else if 2번이면 {}
		System.out.println("위의 번호를 선택하세요.>>>");
		
	
		
		
		select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("국어 영어 수학 점수를 입력하세요");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			sum = (kor + eng + math);
			avg = sum / 5.0;
				System.out.println("학점의 합계와 평균은"+sum+"과"+avg+"이다.");
			
			
			
		} 
		else if (select ==2) {
			System.out.println("숫자를 입력하세요");
			a = sc.nextInt();
			System.out.println( (a%2==0) ? ("짝수입니다.") : ("홀수입니다."));
		}
		
		else if (select ==3) {
			System.out.println("A이름을 입력하세요");
		aName = sc.next();
		System.out.println("B이름을 입력하세요");
		bName = sc.next();
		
		System.out.println((aName.equals(bName)) ? ("같은 이름입니다.") : ("다른이름입니다")); //String은 Heap영역의 비교를 해야한다.
		//if문으로 물을거면 if( aName.equals(bName) ){}
				
		
		
	 }
	}
}
