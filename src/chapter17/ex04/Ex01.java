package chapter17.ex04;

import java.util.ArrayList;

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;

Car(String company, String carModel){
	this.company = company;
	this.carModel = carModel;
}

Car(String company, String carModel, String color){
	this.company = company;
	this.carModel = carModel;
	this.color = color;
}

Car(String company, String carModel, String color, int maxSpeed){
	this.company = company;
	this.carModel = carModel;
	this.color = color;
	this.maxSpeed = maxSpeed;
}

@Override
public String toString() {
	return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
}




}
public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Car> car1 = new ArrayList();
		
		Car c1 = new Car("현대","제니시스");
		Car c2 = new Car("현대","제니시스","검정");
		Car c3 = new Car("현대","제니시스","검정",100);
		
		car1.add(c1);
		car1.add(c2);
		car1.add(c3);
		
		for (int i = 0 ; i<car1.size() ; i++)
		{
			Car cc1 = car1.get(i);
			System.out.println(cc1);
		}
		
		System.out.println("======================================");
		
		
		for (Car k : car1)
		{
			System.out.println(k);
		}
		
		System.out.println("===============================================================");
		
		System.out.println(car1);
		System.out.println(car1.toString());
		
		
		

	}

}
