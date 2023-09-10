package step02;

class A {
	A() {
		System.out.println("Class A");
	}
}

class B {
	B() {
		System.out.println("Class B");
	}
	
	//멤버변수, 필드 > 멤버변수에 등록된 순으로 호출됨
	A a = new A();
}

//? 클래스 내에서 멤버변수, 생성자, 메소드 순으로 실행되는 건가요?
//멤버변수 > 생성자 > 메소드(호출해야 사용 가능)

class C {
	C() {
		System.out.println("Class C");
	}
}

public class Ex03_object {
	public static void main(String[] args) {
		
		B b = new B();
		A a = new A();
		
		//B 타입의 b 객체 생성에 주목 : B객체의 생성완료 시점은 언제인가?
		//객체의 생성은 객체가 보유하고 있는 모든 필드(멤버변수)들이 메모리에 올라가서 생성된 이후에 객체의 생성이 완료된다.
	}
}