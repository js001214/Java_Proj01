package chapter10.ex04;

class Animal {
	//Animal클래스에서 생성된 필드
	String name;
	int age;
	
	//기본 생성자가 생략 되어있다. Animal() {}
//다른 생성자가 있을땐 기본생성자 명시
	

	//Animal에서 선언된 메소드
	void cry() {
		System.out.println("Animal 클래스의 cry()");
	}
}

class Tiger extends Animal{
	//자식 클래스의 생성자에는 기본적으로 super()가 생략되어 있다. 
	//기본 생성자가 생략되어 있다.
	int tigerNo;	//Tiger 생성된 필드
	
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Eagle extends Animal {
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class TigerChild extends Tiger{
	int tigerChildNo;
	void tigerchoildMethod() {
		System.out.println("TigerChild 클래스의 메소드");
	}
	
	@Override
	void cry( ) {
		System.out.println("응애~");
	}
}


public class MethodOverriding_test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속관계에서 부모클래스의 메소드를 자식 클래스에서 재정의
		
		//1. 객체의 타입
		//a1 객체는 Animal만 저장,Animal을 내포하고 있고 Animal에 있는 필드와 메소드만 접근가능
		
		Animal a1 = new Animal(); //Tiger a1은 안됨
		a1.name="동물이름";
		a1.age=10;
		a1.cry();
	
		
		System.out.println("======================");
		
		//2.Tiger 개게를 생성하면서 Tiger 타입으로 지정
		//t1은 Animal,Tiger를 내포하고 있고, Tiger 타입으로 지정(Animal, Tiger 접근)
		Tiger t1 = new Tiger(); //Tiger 객체를 만들면 부모인 Animal 먼저 만들고 Tiger을 만들며 둘 다 내포한다. 
		//부모의 필드와 메소드 호출
		t1.name="호랑이1";
		t1.age=5;
		t1.cry();
		
		//Tiger의 필드 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		t1.cry(); //Animal의 cry는 자식객체인 Tiger cry로 인해 덮어써진다.
		
		//3.Tiger 객체를 생성하면서 Animal 타입으로 지정(Animal 의 필드와 메소드만 접근)
		// a2는 Animal을 가지고 있고 Tiger객체도 있다, 그 중에서 Animal을 타입으로 두게 되면 Animal에 있는 객체만 접근이 가능한데, 그래도 Tiger을 품고 있어서
		// 다운캐스팅을 통해 사용 할 수 있게 된다.
				Animal a2 = new Tiger();
				//Animal 의 필드와 메소드만 접근
				a2.name = "호랑이2";
				a2.age = 5;
				//Tiger에서 오버라이딩을 했기때문에 a2.cry는 Tiger의 cry가 나온다.
				a2.cry();
				
				
				//다운캐스팅 a2 : Animal,Tiger을 내포하고 있고 Animal 타입
				
				Tiger t2 = (Tiger)a2;	//다운 캐스팅할때는 반드시 instanceof를 사용을 해야한다.
				if (a2 instanceof TigerChild) {	//TigerChild가 존재하면 True로서 실행
				TigerChild t3 = (TigerChild) a2;
				}else {
					System.out.println(" a2에는 TigerChild를 내포하고 있지 않습니다.");
				}
				//TigerChild 객체를 생성하면서 Animal 타입으로 지정
				// a4 : Animal, Tiger, TigerChild
				Animal a4 = new TigerChild();
				a4.cry();
				
				//다운 캐스팅: 타입을 명시해야함
				Tiger t10 = (Tiger) a4;	//TigerChild를 객체화해서 만들었기때문에 오버라이딩 돼서 TigerChild cry가 호출된다.
				t10.cry();
				//다운 캐스팅: 타입을 명시해야함
				TigerChild tc10 = (TigerChild)t10;
				tc10.cry();
				
				
				//업캐스팅
				Animal a20 = tc10; 
				
				//배열에 객체를 저장하고 값을 출력하기 위한 객체 생성
				Animal a29 = new Animal();		//a29 : Animal객체만 가지고 있다.
				Animal a30 = new Tiger();		//a30 : Animal타입만 가지고 있고, Tiger도 가지고 있다.
				Animal a31 = new Eagle();		//a31 : Animal, Eagle을 가지고 있다.
				Animal a32 = new TigerChild();	//a32는 : Animal을 가지고 있고 Tiger , TigerChild도 내포하고  있다.
	
				//배열에 Animal 타입의 객체 저장
				Animal[] arr = new Animal[] {a29, a30, a31, a32};
				
				//배열의 값을 출력
				
				for(Animal k : arr)
				{
					k.cry();
				}
				
				System.out.println("==============For문을 사용해서 객체 정보출력================");
				
				//배열의 값 출력 : For문을 사용해서 출력, 배열의 값을 Animal 변수에 할당하고 출력
				
				for (int i = 0 ; i<arr.length ;i++)
				{
					Animal aa = arr[i];
					aa.cry();					
				}
				
				System.out.println("=======================================================");
				for (int i =0 ; i<arr.length ;i++)
				{
					arr[i].cry();
				}
	
				System.out.println("=======================================================");
				//객체 변수를 블락 밖에서 선언후 출력
				Animal aaa = null;		//Animal은 객체형 변수, 초기화 할때 null을 사용 
				for(int i = 0; i < arr.length;i++) {
					aaa = arr[i];
				}
	
	}

}
