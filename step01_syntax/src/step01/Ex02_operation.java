package step01;

public class Ex02_operation {

	public static void main(String[] args) {
		//연산
		int v1 = 10;
		int v2 = 3;
		
		//산술		
		//System.out.println(v1 * v2);
		
		//증감연산 : ++, --
		//System.out.println(v1++);
		//System.out.println(v1);
		
		//ex연산
		byte v3 = 10;
		byte v4 = 3;
		
		//v3과 v4를 이용해 3.3333...을 출력하려면?
		System.out.println((float)v3 / v4);
		
		
		//System.out.println(10/0); //error
		System.out.println(10/0.0); //가능
		
		//NaN (Not a Number)
		System.out.println(5 % 0.0);
		
		//논리연산 : true or false
		boolean t = true;
		boolean f = false;
		
		// && 연산
		// || 연산
		System.out.println(t && t);
		System.out.println(t && f);
		
		System.out.println(t || f);
		System.out.println(f || f);
		
		//! : not 연산자
		System.out.println(!true);
		//^ : 둘의 값이 무조건 다를 때
		System.out.println(t ^ f);
		
		// 대입연산 : =, ...
		int assign = 0;
		assign += 10; //assign = assign + 10;
		System.out.println(assign);
		
		//비교연산 : ==, !=, <, <=, >, >=
		System.out.println(1<10);
		System.out.println(1 == 1.0);
		
		
		
	}

}
