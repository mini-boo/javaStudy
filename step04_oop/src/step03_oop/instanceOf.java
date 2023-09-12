package step03_oop;

class A {}
class B extends A {}
class C extends A {}






public class instanceOf {

	public static void main(String[] args) {
		A b = new B();
		A c = new C();
		
		//instanceOf : b라고 하는 객체는 A, B라는 타입에 존재하니?
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof C);
		
		System.out.println();
		
		System.out.println(c instanceof A); //t
		System.out.println(c instanceof B); //f
		System.out.println(c instanceof C); //t
		
		
		System.out.println();
		
		B b2 = new B ();
		
		System.out.println(b2 instanceof A); //t
		System.out.println(b2 instanceof B); //t
		//ystem.out.println(b2 instanceof C); // 에러

	}

}
