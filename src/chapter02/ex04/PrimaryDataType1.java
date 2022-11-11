package chapter02.ex04;

public class PrimaryDataType1 {

	public static void main(String[] args) {
		// 자료형 : 변수명 앞에 반드시 선언, 변수에 어떤 값을 넣을지 지정 (Java, c, c++)
		// - 기본 자료형 : boolean, byte, short, int, long, float, double, char
			// 메모리의 Stack 공간에 저장, (변수명: 값)
		// - 참조 자료형 : String, 배열, 객체 ... 무한대로 생성가능
			// 메모리의 Heap 공간에 값이 저장된다.
			// 		 stack 공간에는 변수명:Heap에 값의 주소값을 가지고 있다.
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴
		
		// 1. boolean : 변수에 true or false만 가능
		boolean bool1 = true; //선언과 동시에 변수에 값을 할당 // true가 여기선 리터럴
		boolean bool2; 		  //선언후
		bool2 = false;		  //값 할당
		
		System.out.println(bool1); //true
		System.out.println(bool2); //false
		
		
		System.out.println("==================");
		
		// 2. 정수 (byte : 1byte, short : 2byte, int : 4byte, long : 8byte)
			//정수의 기본은 int
			//byte :(1byte= 8bit) : -2^7 ~ 2^7-1	: -128 ~ 127
		byte value1 = -128; //-128이 리터럴
		byte value2 = 127;
		
		System.out.println(value1);
		System.out.println(value2);
		
			//short : (2byte = 16bit) : -2^15 ~ 2^15-1 : -32,768 ~ 32,767
		
		short value3 = -32768;
		short value4 = 32767;
		
		System.out.println(value3);
		System.out.println(value4);
		
		
			//int : (4byte = 32bit) : -2^31 ~ 2^31-1 : -2,147,483,648 ~ 2,147,483,647
		
		int value5 = -2147483648;
		int value6 = 2147483647;
		
		System.out.println(value5);
		System.out.println(value6);
		
		
			//long : 8byte = 64bit  : -2^63 ~ 2^63-1
				//long 의 변수에 값을 할당 할 때는 ,L이나 l을 붙여줘야한다.
				//붙여주지 않으면 기본적으로 int 형으로 값이 저장된다.
		
		long value7 = -100L;
		System.out.println(value7);
		
		
		// 3. 실수 (float : 정밀도 7자리(4byte), double : 정밀도 15자리(8byte)
			// 실수의 기본은 double
		
			// float : float으로 지정된 변수의 값을 할당 할때 리터럴에 f, F 명시를 해야한다.
		float value8 = 1.123456789f ; // 1.1234568 이 나온느데 7자리에서 끝나면서 반올림돼서 8로 나온다.
		// float value8 = 1.123456789 ; // f를 붙여주지 않아 오류 발생한다.
		System.out.println(value8);
		
		double value9 = 1.12345678910111213;
		System.out.println(value9);
		
	    // 4. 문자 (char) : 영문/한글/일본어 etc...숫자, 특수문자 한 글자만
		// 변수의 값을 할당할 리터럴에 ' '
			//1. char 자료형 변수에 직접 문자로 저장하는 방법 (
		char value10 = 'A';  //char value10 = 'AA'; 는 오류가 남
		char value11 = 'a';
		char value12 = '가';
		char value13 = '3';
		char value14 = '#';
		
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		
			//2.정수값으로 문자를 저장하는 방법 : 아스키 코드 값으로 문자를 저장
		
		char value15 = 65;	// A
		char value16 = 0xac00; // 0x : 16진ㄴ수, 0 : 8진수, 0b : 2진수
					//가
		char value17 = 51;	// 3
		
		System.out.println(value15);
		System.out.println(value16);
		System.out.println(value17);
		
		System.out.println("=============================");
		
			//3. 유니코드로 저장하는 방법 : 전 세계의 글자를 3byte로 저장(16진수)
		char value18 = '\u0041' ; //A
		char value19 = '\uac00' ; //가
		char value20 = '\u0033' ; //3
		
		System.out.println(value18);
		System.out.println(value19);
		System.out.println(value20);
		
		/*
		 <문제> 구글을 검색해서 자신의 이름을 유니코드를 찾아서 변수에 할당하고
		 */
		
		char aa = '\uBC15';	//성		박
		char bb = '\uC8FC';	//이름1	주
		char cc = '\uC131';	//이름2	성
		
		System.out.print(aa);
		System.out.print(bb);
		System.out.print(cc);
		
		//박주성
		
		
		
		
		
		// 5. 문자열 (String) : 여러 글자를 담을 수 있다.
			//기본자료형이 아니다. 참조 자료형(객체)
		//	변수의 값을 할당하는 리터럴에 " "
		
		String value21 ="안녕하세요. 오늘의 날씨는 매우 맑습니다.";
		
		System.out.println("value21");
	}

}
