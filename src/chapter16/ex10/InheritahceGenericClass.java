package chapter16.ex10;

//제너릭 클래스의 상속, 자식 클래스는 부모 클래스의 타입변수의 개수가 같거나 많아야 한다.

class Parent<T> {
	T t;
	//getter,setter 생략
}

class Child1<T> extends Parent<T>{ 	//제너릭 클래스를 상속할때 부모에 있는 타입을 자식도 최소한 같거나 많아야한다.
	
}

class Child2<T, V> extends Parent<T>{ 
	
}

public class InheritahceGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
