package chapter11.ex02;

class Student{

	//필드
	String name;
	
	//합계와 평균을 출력 하는 메소드
	void sum_avg() 
	{
		System.out.println("하하하..");
			
	}
}

class Student_Sub extends Student{
	//자식의 필드
	int kor ; //국어 점수  
	int eng ; //영어 점수
	int math; //수학 점수
	
	
	Student_Sub(){}	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math의  평균을 출력하는 메소드
	Student_Sub(String name, int kor, int eng,int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	void sum_avg()
	{
		double sum = kor + eng + math;
		double avg = sum /3.0;
		System.out.println(name + " : ");
		System.out.println("국어 : " + kor + " ");
		System.out.println("영어 : " + eng + " ");
		System.out.println("수학 : " + math + " ");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
	@Override
	public String toString() {
		return "Student_Sub [name= "+ name+" ,kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name + "]";
	}
	
	
}
public class Ex01 {

	public static void main(String[] args) {
		//
		//생성자를 사용해서 객체 생성시 필드
		
		
		//홍길동 70 88 77 
		//이순신 80 68 87 
		//김똘똘 60 86 87 
		//홍길순 77 56 80
		//강감찬 55 66 77
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서 
		//배열을 for문으로 출력 //오버라이딩된 메소드 출력 < 그 학생의 국어 영어 수학의 합계, 평균
		//5명 학생의 국어에 대한 합계, 평균
		//5명 학생의 영어에 대한 합계, 평균
		//5명 학생의 수학에 대한 합계, 평균
		/*
		Student_Sub s1 = new Student_Sub("홍길동",70, 88, 77);
		s1.sum_avg();
		System.out.println();
		Student_Sub s2 = new Student_Sub("이순신",80, 68, 87);
		s2.sum_avg();
		System.out.println();
		Student_Sub s3 = new Student_Sub("김똘똘",60, 86, 87);
		s3.sum_avg();
		System.out.println();
		Student_Sub s4 = new Student_Sub("홍길순",77, 56, 80);
		s4.sum_avg();		
		*/
		Student[] arr= new Student[] {new Student_Sub("홍길동",70, 88, 77),
				new Student_Sub("이순신",80, 68, 87),new Student_Sub("김똘똘",60, 86, 87),
				new Student_Sub("홍길순",77, 56, 80), new Student_Sub("강감찬",55,66,77)};
		//arr[0]=s1;
		//arr[1]=s2;
		System.out.println();
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for ( int i = 0 ; i <arr.length ; i++)
		{
			//System.out.println(arr[i]);
			arr[i].sum_avg();	
		}
	int [] sum = new int [3];
	
	for ( int i = 0 ; i < arr.length ; i++) {
	sum[0] += ((Student_Sub) arr[i]).kor;
	sum[1] += ((Student_Sub) arr[i]).eng;
	sum[2] += ((Student_Sub) arr[i]).math;
	
	if ( i == arr.length-1) 
	{
		System.out.println("========================");
		System.out.printf("5명의 국어 점수의 총 합은 %d 이고 평균은 %4.2f 입니다", sum[0], sum[0]/5.0);
	}
	}
		
		
	}

}
