package Chapter03.ex04;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자 vs 비트연산자를 이용한 논리 연산
		//1. 논리연산자 (AND ( && ), OR ( || ), XOR ( ^ ), NOT ( ! )
		// << 쇼트 서킷이 발생됨 : && , OR >>
		//1-1. AND ( && )
			// true && true	==> true
			// false && false ==> false
			// true && false ==> false
			// false && false ==> false
		System.out.println( true && true ); // true
		System.out.println( true && false ); // false
		System.out.println( false && true ); // false
		System.out.println( false && false ); // false
		System.out.println("=======================================");
		
	//1-2. OR ( || )
		// true || true ==> true
		// true || false ==> true
		// false || true ==> true
		// false || false ==> false
		System.out.println( true || true ); // true
		System.out.println( true || false ); // true
		System.out.println( false || true ); // true
		System.out.println( false || false ); // false
		System.out.println("=======================================");
		
		//1-3. XOR ( ^ ) : 두 값이 같을때 False, 다를때 True
		
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); //false
		System.out.println( true ^ false ); //true
		System.out.println( true ^ false ); //true
		System.out.println(false ^ (5 < 2)); //false
		System.out.println((10>20) ^ (30 > 20)); //  false와 true 비교라서 true
		System.out.println("=======================================");
		
		
		//1-4. NOT ( ! ) : true 일때 false, false 일때 true
		
		System.out.println( ! true ); //false
		System.out.println( ! false ); //true
		System.out.println(false || (5<3)); //false 와 false이기 때문에 false
		System.out.println(false || ! (5<3)); //false 와 true이기 때문에 true  !때문에 false에서 바뀜 true로
		System.out.println( !false || ! (5<3)); //true 와 true이기 때문에 true
		
		//2. 비트연산자로 논리연산이 가능 하다. <=== 쇼트 서킷을 발생하지 않도록 처리한다 (중요해!)
		// AND ( & ), OR ( | ), XOR ( ^ ), NOT ( ~ )
		System.out.println(true  &  true);  //true //비트연산자도 논리 연산이가능하다.
		System.out.println(true | false); //true
		System.out.println(true | (5<3)); //true
		System.out.println(true ^ true); //false
		System.out.println( ! true);  // 논리연산에 비트연산자인 ~ 를 쓰면 오류가나서 ~ true에서 ! true로
		//system.out.println  ( ~ true);
		
		System.out.println("=========================================");
		
		//3.쇼트 서킷 : 논리연산자에서 앞의 내용으로 뒤의 값의 유무없이 식별 가능 하면 뒤의 값은 처리 하지 않는다. (중요해!) 
		
		System.out.println(true && true); //쇼트 서킷이 발생되지 않는다. 뒤의 값을 반드시 확인
		System.out.println(false && true); //쇼트 서킷이 발생
		//AND연산자에서는 처음 값이 false가 오면 뒤에 어떤 값이 오더라도 false
		
		
		System.out.println(false || true); //쇼트 서킷이 발생되지 않는다.
		System.out.println(true || true); //쇼트서킷이 발생
		//OR 연산에서 층ㅁ러음 값이 true이면 쇼트 서킷이 발생된다.
		
		System.out.println("========AND 연산에서 쇼트 서킷  발생 및 방지==================================");
		int value1 = 3;
		System.out.println(false && ++value1 > 6); //false
		System.out.println(value1); //3 value1이 4가 아니라 3이찍혔다는건 쇼트 서킷이 발생해서 뒤에꺼까지 계산을 안 했기 때문
		// 논리연산자 : &&
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); //false
		System.out.println(value2); //4 //비트연산자라 쇼트서킷이 발생 되지 않는다.
		// 비트연산자 : &

		System.out.println("========OR 연산에서 쇼트 서킷  발생 및 방지==================================");
		int value3 = 3;
		System.out.println(true || ++value3 > 6); //true
		System.out.println(value3); //3 value3이 4가 아니라 3이찍혔다는건 쇼트 서킷이 발생해서 뒤에꺼까지 계산을 안 했기 때문
		// 논리연산 : ||
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6); //false
		System.out.println(value4); //4 //비트연산자라 쇼트서킷이 발생 되지 않는다.
		// 비트연산자 : |
		
		// XOR ( ^ )  : 논리.비트연산자 <== 뒤의 값을 반드시 확인해야 결과를 알수 있으므로 쇼트서킷이 발생되지 않는다.
			//앞뒤가 같으면 false // 앞뒤 값이 다르면 true
		
		System.out.println(true ^ true); //false //뒤의 값을 확인해야하는 XOR은 쇼트 서킷이 발생x
		
		
		
		}

}
