package step01.Exception;

class A{}
class B extends A{}
class C extends A{}

public class Ex01_Exception {
	public static void main(String[] args) {
		// NPE
//		String str1 = null;
//		System.out.println(str1.length());
		
		// NumberFormatException
//		String str2 = "three";
//		Integer.parseInt(str2);
		
		// ArithmeticException
//		System.out.println(10 / 0);
		
		// ClassCastException
//		A b = new B();
//		C c = (C)b;
	}
}