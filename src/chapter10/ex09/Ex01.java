package chapter10.ex09;

class Car{
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	//Constructor Using field
	Car(){}
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	
	
	//getter setter
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	//toString()
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
	
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본 생성자, 인풋을 받는 생성자
		// 2. getter, setter 생성
		// 3. toString() 재정의: 전체 메모리 내용 출력.
		// 4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력.
		// 5. setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력.
				//getter를 사용해서 각 필드의 내용을 출력
		System.out.println("======setter 사용==============");
		Car cc1 = new Car();			//setter
		cc1.setCarName("타요");
		cc1.setCarColor("보라색");
		cc1.setMaxSpeed(100);
		cc1.setCarModel("람보르기니");
		
		System.out.println(cc1);
		System.out.println("======toString 사용=============");
		System.out.println(cc1.toString());
		
		System.out.println("=======getter 사용=================");
		
		System.out.println(cc1.getCarName());
		System.out.println(cc1.getCarColor());
		System.out.println(cc1.getMaxSpeed());
		System.out.println(cc1.getCarModel());
		
		
		
	}

}
