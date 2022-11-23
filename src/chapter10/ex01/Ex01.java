package chapter10.ex01;

class Animal {		//Animal클래스를 상속해서  Tiger 클래스 Eagle 클래스 Lion 클래스를 생성 
					// 자식 클래스에서는 필드1, 메소드1 정의
					//LionChild클래스 Lion클래스를 상속해서 필드1 , 메소드1
	String name;
	int age;
	String color;
	
	void eat(){
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep(){
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	
}

class Tiger extends Animal
{
	int TigerID;
	void Tiger1() {
		System.out.println("호랑이는 무섭습니다.");
	}
	
}

class Eagle extends Animal
{
	int EagleID;
	void Eagle1() {
		System.out.println("독수리는 하늘을 납니다.");
	}
}

class Lion extends Animal
{
	int LionID;
	void Lion1() {
		System.out.println("사자는 멋집니다.");
	}
}

class LionChild extends Lion
{
	int LionChildID;
	void LionChild1() {
		System.out.println("아기사자 입니다..");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("============Tiger============");
		//Tiger 부모의 필드와 메소드 출력
		
		
		Tiger t1=new Tiger();
		t1.name = "호랑이";
		t1.age = 10;
		t1.color = "orange";
		t1.TigerID =  1111;
		
		System.out.println(t1.TigerID);
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
		t1.eat();
		t1.sleep();
		t1.Tiger1();
		
		System.out.println("===========Eagle==========");
		
		//Eagle 부모의 필드와 메소드 출력
		
		Eagle e1=new Eagle();
		e1.name = "독수리";
		e1.age = 11;
		e1.color = "갈색";
		e1.EagleID =  1111;
		
		System.out.println(e1.EagleID);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.color);
		
		e1.eat();
		e1.sleep();
		e1.Eagle1();
		
		System.out.println("===========Lion==========");
		
		Lion l1=new Lion();
		l1.name = "사자";
		l1.age = 12;
		l1.color = "주황";
		l1.LionID = 1111;
		
		System.out.println(l1.LionID);
		
		System.out.println(l1.name);
		System.out.println(l1.age);
		System.out.println(l1.color);
		
		l1.eat();
		l1.sleep();
		l1.Lion1();
		
		
		System.out.println("===========LionChild==========");
		
		LionChild lc1=new LionChild();
		lc1.name = "아기사자";
		lc1.age = 1;
		lc1.color = "녹색";
		lc1.LionChildID= 1111;
		lc1.LionID=2222;
		
		System.out.println(lc1.LionChildID);
		System.out.println(lc1.LionID);
		
		System.out.println(lc1.name);
		System.out.println(lc1.age);
		System.out.println(lc1.color);
		
		lc1.eat();
		lc1.sleep();
		lc1.LionChild1();
		lc1.Lion1();
		
	}

}
