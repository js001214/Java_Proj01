package chapter05.ex09;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		// String 클래스에서 사용되는 주요 메소드 (함수)
			//기본자료형 : boolean, byte, short, int, long, float, double, char
			//참조자료형 : 배열 / 열거 / 객체 / 인터페이스 <== 첫자 모두 대문자
		
		//[참조]자료형 [참조]변수
		// 1. 문자열의 길이 (length())
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length ());	//글자의 개수  : 11자
		System.out.println(str2.length());
		
		
		//2. 문자열 검색 (charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));  //charAt(1)에 방번호가 들어가는데 0번방은 H 1번 방은 e
		System.out.println(str2.charAt(1));  //녕
	
	System.out.println();
	
		//indexOf(), lastIndexOf(); <<<한 문자의 방번호를 검색>>>
	System.out.println(str1.indexOf('a'));	//문자 a가 저장된 방 번호를 출력:7   // indexOf는 왼쪽에서시작 lastIndexOf는 반대
	System.out.println(str1.lastIndexOf('a')); //9
	
	System.out.println(str1.indexOf('a', 8)); //8번 방부터 a를 검색 : 9 왼쪽에서
	System.out.println(str1.lastIndexOf('a', 8)); //8번부터 검색 a를 검색 :9 오른쪽에서:7
	
	
	//String str1 = "Hello Java!";
	//String str2 = "안녕하세요! 반갑습니다.";
	System.out.println("===============================");
		//문자열을 검색해서 방번호를 출력
	System.out.println(str1.indexOf("Java")); //6번에서 Java가 시작된다.
	System.out.println(str2.indexOf("하세요"));	//2 //하세요가 시작되는 방번호
	System.out.println(str1.indexOf("ello")); //1
	
	//문자열 검색에 실패시 : -1 값을 출력
		System.out.println(str1.indexOf("bye")); //-1
		
		
		//3. 문자열 변환 및 문자열 연결: String.valueOf(), concat()
		// String.ValueOf() : 기본자료형을 ==> String 자료형으로 변환시킨다

	//String str3 = 2.3; // 오류 발생 2.3은 double형인데 string에 담으려 그래서
	String str3 = String.valueOf(2.3);
	//String str4 = true;		//boolean 타입을 String 변수에 저장시 오류 발생
	String str4 = String.valueOf(true);
	
			System.out.println(str3);
			System.out.println(str4);	
			System.out.println("===================================");
			
			//concat() : + 연산자와 같은 문자열과 문자열을 연결 시켜주는 메소드 // + 같은 느낌

			String str5 = str3.concat(str4);
			String str6 = str3 + str4;
			System.out.println(str5); 
			System.out.println(str6);
			
			//String.ValueOf() + concat() ==> + 
			String str7 = "안녕" + 3;// 안녕3 출력, 3이 String형으로 자동 변환
			String str8 = "안녕".concat(String.valueOf(3)); //내부적으로 작동됨 
			
			
			
			//4. 문자열 ==> byte[] ( getBytes() ) //getBytes가 문자열을 
			//	 문자열 ==> char[] ( toCharArray() )
			
			String str10 = "Hello Java!";
			String str11 = "안녕하세요! 반갑습니다.";
			
			//getBytes(); 문자열을 1글자씩 잘라서 byte 배열에 저장, 아스키 코드값이 출력
			byte[] arr1 = str10.getBytes(); //str10문자열을 arr1 배열에 getBytes를 이용해 문자열 한자한자를 잘라 배열에 넣는다.
			byte[] arr2 = str11.getBytes(); 
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("==================================================");

			//toCharArray() : 문자열을 잘라서 Char배열에 저장
			char[] arr3 = str10.toCharArray(); //Hello Java라는 문자열을 한자한자 잘라서 arr3 char배열에저장 //char배열은 한 문자씩 저장
			char[] arr4 = str11.toCharArray();
			
			System.out.println(Arrays.toString(arr3));
			System.out.println(Arrays.toString(arr4));
			
			System.out.println(arr3[1]);
			
			//5. 문자열 수정, 대문자로 출력 : toUpperCase(), 소문자로 변환 : toLowerCase();
			System.out.println(str1.toLowerCase()); //소문자
			System.out.println(str1.toUpperCase()); //대문자 
			
			System.out.println("==================================================");
			
			//6. 문자열 수정 : replace("수정할 원본", "수정할 내용");
							// substring ( 시작방번호, 잘라올 방번호);
			String str13 = "안녕 자바 World";
			System.out.println(str1.replace("Hello", "안녕"));
			System.out.println(str13.replace("World", "월드"));
			
			//substring (0, 5) // 0번방에서부터 5번방까지 잘라서 출력
			System.out.println(str13.substring(0,5)); //0번에서 시작해서 4번까지 잘라서 출력
				// 모든 프로그램에서 시작은 포함, 끝은 미포함
			System.out.println(str13.substring(3,5)); //자바
			
			//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장
			String[] strArray = "abc/def-ghi jkl".split("/|-| ");  //   /,ㅡ,(공백)을 기준으로 문자를 자른다.
			//index0 행에  abc, def ghi jkl이 0123방으로 
			
			System.out.println(Arrays.toString(strArray));
			
			System.out.println("============================");
			//trim() : 문자열 앞, 뒤의 공백을 제거 하는 메소드

			System.out.println("      abc       ".trim());
			
			System.out.println("============================");
	
			//6. 문자열의 내용비교 ( equals(), equalsIgnoreCase() )
				//equals() : Heap의 값을 비교, 대문자 소문자까지 체크
				//equalsIgnoreCase() : Heap의 값비교, 대.소문자를 체크하지 않고 비교
			String str20 = new String("Java");
			String str21 = new String("Java");
			String str22 = new String("java");
			
			//== : Stack 메모리의 참조 주소 비교. 
			System.out.println(str20 == str21); //false //New를 썼기 때문에 Heap의 주소가 다 다르다
			System.out.println(str20 == str22); //false //New를 썼기 때문에 Heap의 주소가 다 다르다
			System.out.println(str21 == str22); //false //New를 썼기 때문에 Heap의 주소가 다 다르다
			System.out.println("=========================================");
			
			//equals() : 대소문자를 체크 하면서 Heap의 값을 비교.
			System.out.println(str20.equals(str21)); //true // Java Java로 Heap의 값이 같음
			System.out.println(str21.equals(str22)); //false
			System.out.println(str21.equalsIgnoreCase(str22)); //true 
			
			
	}

	
	
}
