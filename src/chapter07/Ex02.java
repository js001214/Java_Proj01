package chapter07;

class Student {
	String stuName; //학생이름
	int stuNum;		//학번을 저장
	String stuAddr; //학생의 주소
	String stuPhone;//학생의 전화번호
	double weight ; //학생의 몸무게
	
	//생성자 오버로딩
	//	기본생성자, 매개변수 3개인 생성자//이름학번전번, 매개변수 5개인 생성자,
	
	// 필드의 값을 출력하는 메소드 void print () {필드의 값을 출력}
	
	
	Student(){} //기본생성자
	
	Student(String stuName, int stuNum, String stuPhone)
	{
		this.stuName=stuName;
		this.stuNum=stuNum;
		this.stuPhone=stuPhone;
	}
	
	Student(String stuName, int stuNum, String stuAddr, String stuPhone,double weight)
	{
		this.stuName=stuName;
		this.stuNum=stuNum;
		this.stuAddr=stuAddr;
		this.stuPhone=stuPhone;
		this.weight=weight;
	}
	
	void print()
	{
		System.out.println("학생이름 : " + stuName);
		System.out.println("학번 : " + stuNum);
		System.out.println("주소 : " + stuAddr);
		System.out.println("전화번호 : " + stuPhone);
		System.out.println("몸무게 : " + weight);
		
	}
	
	
}



public class Ex02 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.print();
		
		Student student2 = new Student("박주성",1214, "01057120133");
		student2.print();
		
		Student student3 = new Student("박주성",1214,"인천","01057120133",67.1);
		student3.print();
		
	}

}
