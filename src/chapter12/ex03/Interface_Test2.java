package chapter12.ex03;

interface Animal1 {
	void cry();
}

interface Animal2 {
	void run();
}

interface Animal3 {
	void eat();
}


//interface에서 interface 상속
//앞의 타입과 뒤의 타입이 동일할때는 extends		//interface끼리 상속 받을때는 extends 써도 돼~
interface K extends Animal1,Animal2,Animal3 {	//Animal123메소드를 다 상속 받는다.
	// k 안에 cry(), run(), eat()가 있다.
}

class G implements K{
	@Override
	public void cry() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}

class Aa { 
	void abc() {System.out.println("Aa의 abd()");}
}

abstract class Bb { 	//추상 클래스는  추상 메소드가 1개라도 존재하면 abstract를 붙여~
	abstract void bcd();
	}

//extends 키 다음에는 1개의 클래스만 올 수 있다.	//클래스는 하나의 부모만 가진다.	//일반클래스 or 추상 클래스
//implements키 다음에는 여러개의 인터페이스가 올 수 있다.
//extends가 먼저오고 implements 순서가 바뀌면 안됨.
class Cc extends Bb implements Animal1, Animal2, Animal3 {
	@Override
	void bcd() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}



public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
