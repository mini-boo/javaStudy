package step02.lamda;

public class lamdaTest {
	
	// 함수 인터페이스 : 추상 메소드 1개만 갖음
	// 람다 1
	@FunctionalInterface
	interface Lambda1 {
		void method1();
	}
	
	//람다2
	@FunctionalInterface
	interface Lambda2 {
		void method2(int i);
	}
	
	//람다3
	@FunctionalInterface
	interface Lambda3 {
		int method3(int x, int y);
	}

	//*적용
	@FunctionalInterface
	interface Calculator {
		int operator(int x, int y);
	}
	
	static int operate(int x, int y, Calculator calculator) {
		return calculator.operator(x, y);
	}
	
	public static void main(String[] args) {
		
		
		
		//람다 1 : 매개변수가 없는 람다식
		Lambda1 lambda1;
		lambda1 = () -> System.out.println("람다 1");
		
		System.out.println(lambda1);
	

	//람다 2 : 매개변수가 있는 람다식, 1개 (자료형, 코드블럭 생략 가능)
	Lambda2 lambda2;
	lambda2 = i -> System.out.println(i+10);


	lambda2.method2(1);
	
	//람다 3 (자료형, 코드블럭, 리턴까지 생략 가능)
	Lambda3 lambda3;
	
	//리턴 생략
	//lambda3 = (int x, int y) -> {
		//return x+y;
	//};
	
	lambda3 = (int x, int y) -> x+y;
	
	System.out.println(lambda3.method3(10, 20));
	
	//적용
	Calculator add = (x,y) -> x+y;
	
	System.out.println(operate(5, 5, add));
	
	
	
	}
}
