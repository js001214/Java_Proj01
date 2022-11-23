package chapter10.ex02;

class Animal {
	String name ;
	int age ;
	
	void eat ( ) {
		System.out.println("모든 동물은 먹습니다.");
	}
	
}

class Tiger extends Animal{
	String tigerSound;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}

class TigerChild extends Tiger{
	String tigerChildSound;
	void tigerchildEat() {
		System.out.println("새끼 호랑이는 젖을 먹습니다.");
	}
}

public class TypeCasting01 {

	public static void main(String[] args) {
		// Type Casting (형 변환) : 
		
		//1. 업캐스팅 : Tiger(자식) == 객체 ==> Animal (부모)
		//업캐스팅 : 자식 객체를 생성해서 부모 타입으로 정의, 자동으로 일어남, 객체 만들때 (Animal) new Tiger();로 안 해도 된다.
		//a1은 Tiger 필드,메소드 + Animal 필드와 메소드도 포함.
		//	Animal의 필드와 메소드만 사용 가능
		Animal a1 =new Tiger ();	//Tiger객체를 생성해서 Animal 타입으로 지정(업캐스팅)


		//a1은 Animal 타입의 필드와 메소드만 사용 가능
		a1.name = "호랑이";
		a1.age = 10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		a1.eat();
		
		
		System.out.println("===============다운 캐스팅======================");
		//2. 다운 캐스팅 : Animal (부모 타입) --> Tiger (자식 타입), 수동으로 명시해줘야한다.
			//a1 : Tiger 필드,메소드 + Animal 필드와 메소드도 포함.
			//a1은 animal 타입에서--->t2 (Tiger) 타입으로  다운캐스팅
		Tiger t2 = (Tiger) a1; //a1을 (Tiger)로 다운 캐스팅하고 t2는 Tiger라는 타입을 만들어라
		//t2는 Animal과 Tiger의 필드와 메소드를 모두 접근 가능하다.
		
		t2.name ="호랑이2";
		t2.age = 6;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.eat();
		
		//Tiger의 필드와 메소드도 접근 가능
		t2.tigerSound="어흥";
		System.out.println(t2.tigerSound);
		t2.tigerEat();
		
		//2. Tiger 타입으로  객체 생성 : Animal, Tiger의 필드와 메소드 모두 접근
		//t3는 animal , tiger모두 내포
		Tiger t3 = new Tiger();
		
		//다운 캐스팅 : 실행시 오류 발생 , 왜 why  t3에는 TigerChild라는 객체가 내포 되어 있지 않기 때문에 
		//다운캐스팅 실행시 오류 발생
		System.out.println("=====instanceof 출력=====");
		System.out.println(t3 instanceof Animal); //true
		System.out.println(t3 instanceof Tiger); //true
		System.out.println(t3 instanceof TigerChild); //false
		if (t3 instanceof TigerChild) {	//다운캐스팅을 할때는 instanceof로 반드시 확인을 하고 실행해야 오류가 나지 않는다.
		TigerChild t4 =(TigerChild)t3; 
	}
		
		System.out.println("=====================");
		
		//1.업캐스팅 : a3는 Animal, Tiger, TigerChild
			//Animal 타입의 필드와 메소드만 접근 가능
		Animal a3 =(Animal) new TigerChild();
		System.out.println(a3 instanceof Animal);		//true
		System.out.println(a3 instanceof Tiger);		//true
		System.out.println(a3 instanceof TigerChild);	//true
		
		//a3 : Animal 의 필드와 메소드만 접근
		a3.name = "호랑이4";
		a3.age = 7;
		a3.eat();
		
		//a3를 Tiger 타입으로 다운 캐스팅
		Tiger t5=null;	//블락 밖에서 캐스팅할 변수 선언,null로 객체 초기화
		if (a3 instanceof Tiger) {
			t5 = (Tiger) a3;
		}
		//Animal
		t5.age=10;
		System.out.println(t5.age);
		t5.name = "호랑이5";
		System.out.println(t5.name);
		
		//Tiger
		t5.tigerSound = "어흥"; //Tiger
		
		//3. a3를 TigerChild로 다운캐스팅
		
		TigerChild t6 = null; //블락 밖에서 변수 선언
		if (t3 instanceof TigerChild)
		{
			t6 = (TigerChild) t3;
		}
	
		//t6는 TigerChild 타입 (Animal, Tiger, TigerChild의 필드와 메소드를 모두 접근가능)
		t6.age = 2; //Animal
		t6.tigerSound = "어흥어흥"; //Tiger
		t6.tigerChildSound = "어흥"; //TigerChild
		
		//t6 (TigerChild) ---> Animal로 업캐스팅
		
		Animal t7 =(Animal) t6;		//t7 : Animal, Tiger, TigerChild //Animal만 접근 가능 
		Tiger t8 = t6;				//t8 : Animal, Tiger, TigerChild //Animal,Tiger만 접근 가능
	}
}
