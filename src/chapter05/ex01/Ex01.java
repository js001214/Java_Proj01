package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		// 배열 선언 4가지 방법
		// 1. 배열 변수 이름 : arr1, 정수로 방 3개로 지정, 40, 50 ,60 넣고 출력 <<배열 선언1>>
		// 2. 배열 변수 이름 : arr2, 실수로 방 3개로 지정, 40.0, 50.0, 60.0,70.0 넣고 출력 <<배열 선언2>>
		// 3. 배열 변수 이름 : arr3, 문자열 3개, "오늘", "날씨", "흐림" <<배열 선언3>>
		// 4. 배열 변수 이름 : arr4, 문자 3, 'A', 'B', 'C' <<배열 선언4>>
		
		int[] arr1= new int[3];  //배열 선언하고 배열 값을 직접 넣고 출력
		arr1[0] = 40;
				arr1[1] = 50;
						arr1[2] = 60;
		 System.out.println(arr1[0]);
		 System.out.println(arr1[1]);
		 System.out.println(arr1[2]);
		 
		 System.out.println("\n============================\n");
		 
		 
		double arr2[] = new double[4];	//배열 선언과 방크기 할당
		arr2[0] = 40.0;
		arr2[1] = 50.0;
		arr2[2] = 60.0;
		arr2[3] = 70.0;
		for (int i = 0; i < 4; i++)
		{
			System.out.println(arr2[i]);			
		}
		System.out.println("\n============================\n");
		
		String arr3[] = new String[] {"오늘","날씨","흐림"};		//선언과 동시에 배열 값을 할당  //new String 포함
	
		
		 System.out.println(arr3[0]);
		 System.out.println(arr3[1]);
		 System.out.println(arr3[2]);
		 
			System.out.println("\n============================\n");
		 
		 char arr4[] = {'A', 'B', 'C'};  	//선언과 동시에 배열 값을 할당 // new Char 빼고
		 System.out.println(arr4[0]);
		 System.out.println(arr4[1]);
		 System.out.println(arr4[2]);
		 
		 
	}
	

}
