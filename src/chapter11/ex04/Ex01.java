package chapter11.ex04;

abstract class Car {	//트럭, 자가용, 굴삭기 <==추상 메소드를 구현한 클래스 생성
	abstract void run();
	abstract void eat();
}


//Truck --> Car 추상클래스
class Truck extends Car{
	@Override
	void run() {
		System.out.println("트럭은 트럭이다");
	}
	@Override
	void eat() {
		System.out.println("트럭은 먹는게 아니에요");
	}
}

//Vehicle -- > Car 추상 클래스 // void run()만 입력
abstract class Vehicle extends Car{
	@Override
	void run() {
		System.out.println("자가용은 자가용이다.");
		
	}
}

//Excavator --> Vehicle --> Car // void eat() 나머지 입력 
class Excavator extends Vehicle
{
	@Override
	void eat() {
		System.out.println("굴삭기는 먹는게 아니에요");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Car cc1 = new Truck();
		cc1.run();
		cc1.eat();
		
		System.out.println("==========================");
		
		
		Car cc2 = new Excavator();
		cc2.run();
		cc2.eat();
		
		System.out.println("==========================");
		Vehicle cc3= new Excavator();
		
		cc3.eat();
		cc3.run();
		
		

	}

}
