package Chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 	: if ~else 구문을 축약해서 사용 할때 자주 사용하는 구문
			//(조건) ? 참 : 거짓; // 괄호'(조건)'가 참이면 ? 뒤에 '참'을 실행, 괄호'(조건)'이 거짓이면 ? '거짓'실행
		
		int value1 = ( 3 > 5 ) ?  6 : 9; // 조건이 거짓(false)이라 value1에는 9가 들어감
		System.out.println(value1);
		
		int value2 = ( 3 < 5 ) ? 6 : 9;	//조건이 참(true)이므로 value2에는 6이 들어감
		System.out.println(value2); //6
		
		
		
		
		
		}

}
