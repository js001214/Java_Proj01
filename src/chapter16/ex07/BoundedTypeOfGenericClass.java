package chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한을 할 수 있다. , extends 키를 사용해서 제한
	//extends 키를 사용해서 제너릭 타입에 들어오는 타입에 제한을 둘 수 있다
class A{}
class B extends A{}
class C extends B{}

class D<T extends B> {	//extends B는 T타입으로 들어오는 타입을 제한을 둘 수 있다. B,C (O) , A(X)
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	D <A> d1 = new D<>();	//오류 발생됨, A 타입은 T에 들어갈 수 없다.
			D <B> d2 = new D<>();	//T : B 타입은 들어감
			D <C> d3 = new D<>();	//T : C 타입은 들어감
			D d4 = new D();	// == D<B> d4 = new D(); //타입을 생략해서 호출하면 제한된 타입이 기본으로 들어온다.
			
			//setter를 사용해서 타입에 값 입력
			d2.setT(new B());	//d2는 B를 정의해서 객체를 생성,setter 주입시 B타입의 객체를 주입.
			d3.setT(new C());
			
			//
			//d3.setT(new B()); 	//d3는 C타입으로 정의 되어있다. //B를 객체화 해서 C타입으로 올 수 없다.
									//B를 객체화하면 , A,B를 내호하고 있고 C객체가 내포 되어 있지 않다.
			d3.setT(new C());
			d2.setT(new C()); //C객체가 B타입으로 업캐스팅됨 
	}

}
