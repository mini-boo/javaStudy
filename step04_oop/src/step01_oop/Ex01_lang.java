package step01_oop;

class IT {
	public int num;
	
	public IT(int num) {
		this.num = num;
		System.out.println("IT " + num + "가 생성 되었습니다.");
	}
	
	// 객체가 제거 될때에 자동으로 호출되는 메소드
	public void finalize() {
		System.out.println("IT " + num + "가 제거 되었습니다.");
	}
}


public class Ex01_lang {
	public static void main(String[] args) {
		// Object 클래스
		Object obj1 = new Object();
		System.out.println(obj1);
		
		// hashcode() : 객체 주소값을 정수로 변환
		System.out.println(obj1.hashCode());
		
		// toString() : 객체의 정보(주소값)를 문자열로 반환
		// *객체출력시 자동으로 호출되는 메소드
		System.out.println(obj1.toString());
		
		// equals() : 동일한 객체인지 비교후 그 결과 반환
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));

		// System 클래스
		// getProperty() : 시스템의 속성값 활용
		System.out.println(System.getProperty("java.home"));
		
		// gc() : 쓰레기 수집기 메소드 호출(더이상 사용되지 않는 객체의 메모리를 반환)
		IT it;
		it = new IT(1);
		it = null;
		it = new IT(2);
		it = new IT(3);
		
//		System.gc();
		
		
		
		// String 클래스
		String str00 = "String";
		String str01 = "String";
		String str02 = new String("String");
		
		//eqauls() : 문자열 값을 비교 후 결과를 반환
		//System.out.println(str00.equals(str01)); //t
		//System.out.println(str00.equals(str03)); //f
		
		// ==
		//System.out.println(str00 == str01); /t
		//System.out.println(str00 == str02); /f
		
		// charAt() : 지정 인덱스 위치 문자를 반환
		String str1 = "Java API";
		System.out.println(str1.charAt(0));
		
		//System.out.println(str1.charAt(8)); //StringIndexOutOfBoundsException
		
		// length() : 문자열의 길이를 반환
		System.out.println(str1.length());
		
		// indexOf() : 찾고자 하는 문자의 위치를 반환
		System.out.println(str1.indexOf("a"));
		
		// toXXXCase() : 대소문자 변경
		System.out.println(str1.toUpperCase());
		
		// substring() : 지정 위치에서 또 다른 지정 위치의 문자열을 반환
		System.out.println(str1.substring(2, 6));
		
		// replace() : 지정 문자열 치환 후 반환
		System.out.println(str1.replace("Java", "자바"));
		
		// trim() : 문자열의 앞, 뒤 공백 제거
		String strTrim = "          JAVA API           ";
		System.out.println(strTrim.length());
		System.out.println(strTrim.trim().length());
		
		// split() : 특정 구분자를 기준으로 분리된 문자열 배열 객체 반환
		String strSplit = "JAVA-API";
		System.out.println(strSplit.split("-"));
//		for(String word : result) {
//			System.out.println(word);
//		}
		
		//https://docs.oracle.com/javase/8/docs/api/index.html
		
		
		// StringBuilder
				// 실제로 String은 불변객체이다!
				String str = "abc";
//				System.out.println(str.getClass());
				
				// "abc"에 "def"를 추가하면?
				System.out.println("before" + " " +str.hashCode());
				str += "def";
				System.out.println("after" + " " + str.hashCode());
				
				// StringBuilder
				StringBuilder sb = new StringBuilder();
				sb.append("abc");
				System.out.println("before" + " " +sb.hashCode());
				
				sb.append("def");
				System.out.println("after" + " " + sb.hashCode());
				
			//abc와 def 사이에 값을 넣는 법?
				sb.insert(4, "x");
				System.out.println(sb);
		
		// valueOf() : 기본타입 문자열로 반환
				int i = 10;
				System.out.println(String.valueOf(i));
				
		//문자열 --> 기본타입으로 반환
				Integer.parseInt("10");
				
				System.out.println(Integer.parseInt("10"));
				
		
		// 기본 타입 <-> 객체 타입
		// Wrapper 클래스 : 기본 타입의 값을 갖고 있는 객체
		// 박싱 Boxing : 클래스로 만들어진 객체
			Integer intgr1 = new Integer(10);
//			System.out.println(intgr1.getClass());
//			System.out.println(10+intgr1);
			
			Double double1 = new Double(10.3);
		
		// 언박싱 Unboxing : 원래 객체가 풀림
			
			int i1 = intgr1.intValue();
			
			double double11 = double1.doubleValue();
		
		// 자동 박싱/언박싱 : 원래 객체가 자동으로 풀림
			Integer intgr2 = 3;
			
			int i2 = intgr2;
		
		// parseXXX() : 문자열을 기본타입으로 변경
			System.out.println(Integer.parseInt("3"));
				
				
		
		// Math 클래스
		// abs() : 절대값 표현 메소드
			System.out.println(Math.abs(-20));
		
		// ceil() : 올림값, floor() : 내림값, round() : 반올림값
			System.out.println(Math.ceil(2.1));
		
		// max(), min()
			System.out.println(Math.max(2, 4));
		
		// random() : 0.0 <= random < 1.0 
			System.out.println(Math.random());
			
			//1~10까지 난수 생성
			System.out.println((int)(Math.random()*10)+1);
		
	}
}