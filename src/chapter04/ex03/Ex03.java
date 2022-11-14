package chapter04.ex03;

class Ex03 {

	public static void main(String[] args) {
		// <문제> : 2중 For문을 사용해서 1단 ~ 9단 출력(print로 \t)
		//  1단
		//1*1=1 1*2 =2 1*3=3.... 1*9=9
		//	2단
		
		
		for (int i=1 ; i<10 ; i++) 
		{
			System.out.print("\n"+i+"단\n ");
		 for (int j= 1; j<10; j++)
		 {
			 System.out.print("\t"+i+" * "+j+" = "+i*j);
		 }
		 
		}
		
		
		
		//선생님이 하신거
		System.out.println("===================print()===================");
		for (int i=1 ; i<10 ; i++) 
		{
			System.out.println(i+" 단 ");
		 for (int j= 1; j<10; j++)
		 {
			 System.out.print(i+" * "+j+" = "+i*j+ "\t");
		 }
		 System.out.println();
		}
		//printf()를 사용해서 출력 부분을 간결하게 처리
		System.out.println("=============printf()==================");
		for (int i=1 ; i<10 ; i++) 
		{
			System.out.println(i+" 단 ");
		 for (int j= 1; j<10; j++)
		 {
			 System.out.printf("%d * %d= %d \t ",i ,j ,i*j);
		 }
		 System.out.println();
		 System.out.print("\n");
		}
	}

}
