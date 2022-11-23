package chapter10.ex02;

class Human {
	String name;
	int age;
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
				
	}
}


class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}

class Student2 extends Student{
	String stu2ID;
	void stu2Eat()
	{
		System.out.println("학생2는 음식을 맛나게 먹습니다.");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1.Student 클래스를 생산하면서 Human 타입으로 지정 h1
		Human h1 = (Human)new Student();
		h1.name = "홍길동";
		h1.age = 12;
		h1.eat();
		
		System.out.println("==========================");
		//2.Student 클래스 생성하면서 Student 타입으로 지정 s1
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 12;
		s1.eat();
		s1.stuID="야옹";
		s1.stuEat();
		
		
		//3.Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		Human h2 = new Student2();
		h2.name = "홍길동";
		h2.age = 12;
		h2.eat();
		
		//4.Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		Student s2 =new Student2();
		s2.name = "홍길동";
		s2.age = 12;
		s2.eat();
		s2.stuID="야옹";
		s2.stuEat();
		
		//3.Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		Student2 s3 = new Student2();
		s3.name = "홍길동";
		s3.age = 12;
		s3.eat();
		s3.stuID="야옹";
		s3.stuEat();
		s3.stu2ID="냥냥";
		s3.stu2Eat();
		
		//다운캐스팅 실습
		
		
		
		System.out.println();
	}

}
