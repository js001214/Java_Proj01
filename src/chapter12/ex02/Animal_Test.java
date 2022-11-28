package chapter12.ex02;



public class Animal_Test {

	public static void main(String[] args) {
		//1. 구현한 객체를 생성후 Animal 타입으로 지정함.
		//Animal : 인터페이스
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		Animal a4 = new Eagle();
		
		//2. Animal 배열에 저장
		Animal[] arr = new Animal[] {a1, a2, a3, a4};
		
		for (int i = 0 ; i < arr.length ; i++)
		{	//Animal의 cry(), run() 호출시, 구현 한 클래스의 오버라이딩된 메소드를 호출
			arr[i].run();
			arr[i].cry();
		}
		System.out.println("=========================");
		
		//4. Enhanced FOR문 
		for (Animal k : arr) {
			k.run();
			k.cry();
		}
		
		

		
		
		
		

	}

}
