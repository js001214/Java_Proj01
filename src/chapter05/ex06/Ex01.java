package chapter05.ex06;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 

		int[][] arr1 = new int[][] {{ 10, 20, 30, 40, 50}, {11,12,13,14,15}, {111,112,113,114,115}}; //[3][5] 
		
		//이중 for문을 사용해서 2차원 배열의 값을 출력
		
		System.out.println("==For 문을 사용해서 출력==");
		for (int i = 0 ; i < arr1.length ; i++)  //여기서 length는 3개행 012 뜻한다.
		{
			for (int j = 0 ; j < arr1[i].length ; j ++) //여기서 length는 arr1[i] 0 1 2 의 각 열의 개수를 뜻한다.
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		//2.향상된 For 문을 사용해서 출력
		System.out.println("==향상된 FOR 문을 사용해서 출력==");
		
		for (int[] arr2: arr1) 		//arr1의 첫번째 행을 가지고 와서 arr2에 담는다. 여기서 arr2는 int의 1차원 배열이다. //바깥쪽 for문은 배열 자체를 가져온다
		{
			for (int k : arr2)		//arr2의 배열을 다시 enhanced for문으로 k로 arr2 배열을 출력한다.
			{
				System.out.print(k+ " ");
			}
			System.out.println();	
		}
		
		//3. Arrays.toString()를 사용해서 출력 : 1차원 배열의 값을 출력
		System.out.println("===Arrays.toString() 문을 사용해서 출력===");
			for (int[] arr3 : arr1) {
				System.out.println(Arrays.toString(arr3));
			}
		
	}
}
