package chapter05.ex09;

public class PlusOperatorOfString {

	public static void main(String[] args) {
		// + : 문자열일때 문자열을 연결
		// + : 정수일때는 + 연산자로 사용
		
		//1.문자열 + 문자열
		String str1 = "안녕" + "하세요" + " ! "; //리터럴
			System.out.println(str1);
			
		String str2 = "반갑";
		str2+="습니다";		// str2= str2(반갑) + 습니다
		str2+= "!";			// str2= str2(반갑습니다) + "!" 
		
		System.out.println(str2);
		
		//2. 문자열+기본자료형 연결(boolean,byte,short,int, long, float, double, char)
		String str3= "안녕" + 1;
		String str4= "안녕" + false;         //문자열에다가 기본자료형을 넣으면 문자열로 다 변경 돼서 처리됨
			//기본 자료형을 String 자료형으로 변환: String.valueOf(1) //
		String str5 = "안녕" + String.valueOf(1); // string 타입으로 변환
		String str6 = "안녕" + "1";
		
		System.out.println(str3); //안녕1
		System.out.println(str4); //
	}

}
