package step01;

public class Ex01_Variable {

	public static void main(String[] args) {
		//기본 타입
		
		//정수
		byte vb1 = 10; //초기화
		//byte vb2 = 128; //불가능
		short vs1 = 128;
		
		int vi1 = 10; //가끔 10을 이진수로 표기해야하기도 함
		//int vi2 = 0B1010; //바이너리(이진수로) 표기
		//System.out.println(vi2);
		
		long vl1 = 10;
		//int vi3 = 10000000000;
		//long vl2 = 10000000000; //에러 
		long vl2 = 10000000000L; //에러 
		//System.out.println(vl2);
		
		//JAVA는 정수 연산에서 기본적으로 int타입을 사용한다!
		
		//실수
		float vf1 = 3.14F;
		System.out.println(vf1);
		
		//문자형
		char vc1 = 'A';
		char vc2 = 65; //아스키 코드
		System.out.println(vc2);
		
		//논리
		boolean isTrue = true;
		boolean isFalse = false;
		
		
		
		
		
	}

}
