package chapter10.ex03;

class Fruit{	//Fruit의 메소드를 오버라이딩 해서 출력. Apple, Banana, Orange
	void eat(){
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}

class Apple extends Fruit{
	void eat() {
		System.out.println("사과는 맛있습니다.");
	}
}

class Banana extends Fruit{
	void eat() {
		System.out.println("바나나는 맛있습니다.");
	}
}

class Orange extends Fruit{
	void eat() {
		System.out.println("오렌지는 맛있습니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		Fruit a1 = new Apple();
		a1.eat();
		
		Fruit a2 = new Banana();
		a2.eat();
		
		Fruit a3 = new Orange();
		a3.eat();
		
		

	}

}
