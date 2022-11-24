package chapter10.ex08;



class Animal{
	void run (){
		System.out.println("모든 동물은 달립니다.");
	}
}

class Man extends Animal{
	//super(); 생략
	@Override
	void run() {
		System.out.println("남자");
	}
}
class Woman extends Animal{
	void run() {
		System.out.println("여자");
	}
}
class Lion extends Animal{
	void run() {
		System.out.println("사자");
	}
}
class Tiger extends Animal{
	void run() {
		System.out.println("호랑이");
	}
}
class Dog extends Animal{
	void run() {
		System.out.println("강아지");
	}
}
class DogChild extends Dog{
	void run() {
		System.out.println("아기 강아지");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		//	Animal : 부모 클래스, run() 정의
		//  자식 클래스 : Man, Woman, Lion, Tiger, Dog, DogChild <== 다형성
		//		- 부모의 run 메소드를 재정의
		//	arr 배열에 Animal 타입으로 저장후 For, Enhanced For로 출력
		//

		Animal aa = new Animal();
		aa.run();
		
		Man mm = new Man();
		mm.run();
		
		Animal am = new Man();
		am.run();
		
		System.out.println("================================================");
		
		Animal a1 = new Man();
		a1.run();
		Animal a2 = new Woman();
		a2.run();
		Animal a3 = new Lion();
		a3.run();
		Animal a4 = new Tiger();
		a4.run();
		Animal a5 = new Dog();
		a5.run();
		Animal a6 = new DogChild();
		a6.run();
		System.out.println("================================================");
		
		Animal [] arr1 = new Animal[] {a1, a2, a3, a4, a5, a6};
		
		for(Animal k : arr1)
		{
			k.run();
		}
		
		System.out.println("=======================================================");
		for (int i =0 ; i<arr1.length ;i++)
		{
			arr1[i].run();
		}
		
		
		
		
		
		
		
	
	}

}
