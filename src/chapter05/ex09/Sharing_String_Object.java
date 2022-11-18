package chapter05.ex09;

public class Sharing_String_Object {

	public static void main(String[] args) {
		// 문자열 객체의 공유
		
		//1. 문자열 객체의 공유: 리터러로 객체를 생성시 공유된다.
		//					new 생성자를 사용해서 객체를 생성할때는 공유되지 않는다. 별도의 공간에 생성된다.
		
		String str1 = new String("안녕");
		String str2 = "안녕";//
		String str3 = "안녕";//  리터럴로 만들면 주소 값이 다 동일해야한다.
		String str4 = "안녕";//
		String str5 = new String("안녕"); //new를 통해 만들면 Heap 영역에 새로운 "안녕"이 생긴다.
		//2. Stack메모리의 주소값 비교 ( == : Stack의 값을 비교)
		//			equals() : Heap의 값을 비교 참조객체.equals (비교객체);
				System.out.println(str1==str2); //false //주소값이 다르다.
				System.out.println(str2==str3);	//true
				System.out.println(str4==str3); //true
				System.out.println(str2==str4);	//true
				System.out.println(str1==str5);	//false
				
				
				
		System.out.println("============================================");
		//3. equals () : Heap 영역의 값을 비교
		
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		System.out.println(str1.equals(str4)); //true
		System.out.println(str1.equals(str5)); //true
				
	}

}
