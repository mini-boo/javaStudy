package step06_interfaceex;

public class CalculatiorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1, 2));
		
		//다른 두 인터페이스에 메소드 이름이 같으면 구별하는 방법이 있나요? > 적용은 되지만 구별하는 방법이 없음 (단일 상속 기준)
		//인터페이스는 객체를 생성할 수 없지 않나요? > 객체는 생성할 수 없음. 밑의 calculator는 class로 생성
		
		//Calculation tester = new Calculator();
		//tester.test();

	}

}
