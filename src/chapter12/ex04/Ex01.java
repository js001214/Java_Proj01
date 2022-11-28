package chapter12.ex04;



interface Animal{}

interface Animal1 extends Animal {
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

class Cat implements Animal1, Animal2{			//cat
	@Override
	public void cry() {
		System.out.println("Cat cry");
		
	}
	@Override
	public void run() {
		System.out.println("Cat run");
		
	}
}

class Tiger implements Animal1, Animal2{		//Tiger
	@Override
	public void cry() {
		System.out.println("Tiger cry");
		
	}
	@Override
	public void run() {
		System.out.println("Tiger run");
		
	}
}

class Dog implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("Dog run");
		
	}
	@Override
	public void eat() {
		System.out.println("Dog eat");
		
	}
}


class Lion implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("Lion run");
		
	}
	@Override
	public void eat() {
		System.out.println("Lion eat");
		
	}
}


class Eagle implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		System.out.println("Eagle cry");
		
	}@Override
	public void run() {
		System.out.println("Eagle run");
		
	}@Override
	public void eat() {
		System.out.println("Eagle eat");
		
	}
}



//Cat, Tiger, <== cry(), run() 메소드만 구현
//Dog, Lion	 <== run(), eat() 구현
//Eagle 	<==cry(), run(), eat()

//배열에 넣어서 오버라이딩된 메소드 출력
	//instanceof를 사용해서  객체 내부의  Cat, Tiger 타입이 있으면 cry(), run()
	//instanceof를 사용해서  객체 내부의  Dog, Lion 타입이 있으면 run(), eat()
	//instanceof를 사용해서 Eagle이 있으면 cry,run,eat출력
public class Ex01 {
	
	public static void main(String[] args) {
	
	Animal a1 = new Cat();
	Animal a2 = new Tiger();
	Animal a3 = new Dog();
	Animal a4 = new Lion();
	Animal a5 = new Eagle();
	
	Animal[]arr = new Animal[] {a1,a2,a3,a4,a5};
	
	//2.for문
	
	for ( int i = 0 ; i < arr.length ; i++)
	{	if (arr[i] instanceof Cat || arr[i] instanceof Tiger) {
		((Animal1)arr[i]).cry();
		((Animal2)arr[i]).run();
	}
	if (arr[i] instanceof Dog || arr[i] instanceof Lion) {
		((Animal3)arr[i]).eat();
		((Animal2)arr[i]).run();
	}
	if (arr[i] instanceof Eagle) {
		((Animal1)arr[i]).cry();
		((Animal3)arr[i]).eat();
		((Animal2)arr[i]).run();
	}
	}
	

	
	
	
	
	
	}
}
