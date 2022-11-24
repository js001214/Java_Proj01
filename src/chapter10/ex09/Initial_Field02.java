package chapter10.ex09;

class Student1 {
		//필드 : 접근제어자가 private 일때 외부에서 필드를 접근 불가,
		//getter, setter를 사용해서만 접근이 가능
		private String name;
		private int stuID;
		private int age;
		private String stuAdd;
		private String stuPhone;
		private double weight;
		private int month;
		
		//생성자 //Constructor Using field
		Student1() {} //다른 생성자가 있을때는 기본생성자를 명시해줘야한다.
		public Student1(String name, int stuID, int age, String stuAdd, String stuPhone, double weight, int month) {
			
			this.name = name;
			this.stuID = stuID;
			this.age = age;
			this.stuAdd = stuAdd;
			this.stuPhone = stuPhone;
			this.weight = weight;
			this.month = month;
		}
		
		
		//getter, setter 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStuID() {
			return stuID;
		}
		public void setStuID(int stuID) {
			this.stuID = stuID;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getStuAdd() {
			return stuAdd;
		}
		public void setStuAdd(String stuAdd) {
			this.stuAdd = stuAdd;
		}
		public String getStuPhone() {
			return stuPhone;
		}
		public void setStuPhone(String stuPhone) {
			this.stuPhone = stuPhone;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		
		
		//객체 자체를 프린트 할때 필드의 내용 값 전체를 출력 할 수 있도록 toString() : Object의 메소드
		@Override
		public String toString() {
			return "Student1 [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
					+ stuPhone + ", weight=" + weight + ", month=" + month + "]";
		}
		
		
		
		
		
}
public class Initial_Field02 {

	public static void main(String[] args) {
		// 1.모든 필드의 접근 제어자가 private 이므로 필드에 직접 접근이 불가.
		// setter를 사용해서, 생성자를 사용해서 값을 할당
		Student1 s1 = new Student1();
		
		s1.setName("세종대왕");
		s1.setAge(50);
		
		System.out.println(s1);

	}

}
