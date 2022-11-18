package chapter07;
 //필드 
class Car{
	String company;								//필드에 있는 값은 Heap영역에 저장
	String car_Name;
	String color;
	int year;
	int maxSpeed;
	//생성자 오버로딩 : 시그니쳐에 따라서 다른 생성자를 호출
	
	//기본 생성자 //기본생성자를 필드에 있는 값이 초기화???
	Car ( ){}
	
	//생성자 : 매개변수가 3개인 생성자
	Car(String company, String car_Name, String color) // 인풋 받아서 company로 가고 필드로 값을 할당한다.
	{
		this.company = company;
		this.car_Name = car_Name;
		this.color = color;
		
	}
	
	Car(String company, String car_Name, String color, int year, int maxSpeed)  //매개변수로 들어오는 값들은 필드로 할당한다
	{
		this.company = company;
		this.car_Name = car_Name;
		this.color = color;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}
	
	void print ( ) {										//필드의 값을 찍는 메소드
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + car_Name);
				System.out.println("차색깔 : " + color);
				System.out.println("연식 : " + year);
				System.out.println("최대 스피드 : " + maxSpeed);
	}
}


public class Constructor01 {

	public static void main(String[] args) {
		
		
		//1.  기본생성자로 객체 생성
		Car car1 = new Car(); //기본생성자 호출
		car1.print();
	
	
		//2. 매개변수 3개인 생성자 호출
		Car car2 = new Car("현대자동차", "그랜저", "검은색");
		car2.print();
		
		//3. 매개변수 5개인 생성자 호출
				Car car3 = new Car("기아자동차","k9","붉은색",2022,300);
				car3.print();	//필드의 저장된 값을 출력
	System.out.println("=============================================");
	//
	Car car4 = new Car("삼성자동차","SM5","갈색",2020,200);
	car4.print();
	
						
	}

}
