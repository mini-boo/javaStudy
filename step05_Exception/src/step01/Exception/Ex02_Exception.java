package step01.Exception;

class Info {
	static {
		System.out.println("Info 클래스");
	}
}

public class Ex02_Exception {


	public static void main(String[] args) {
		// step01 : 예외발생 ~ 처리(기본)
		
		try {
			Class.forName("step01.Exception.Info");
		} catch (ClassNotFoundException e) {
			//개발시에만 사용하는 메소드
			//e.printStackTrace();
		} finally {
			//ex : 외부 자원을 반환할 때 사용됨.
			//System.out.println("finally block");
		}
		
		//step02 : 다중예외처리
		try {		// NPE
			String str1 = null;
			System.out.println(str1.length());
			
			// NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
		} catch (NullPointerException | NumberFormatException e) {
			e.printStackTrace();
			System.out.println("같은 예외 해결 코드");
		} catch (Exception e) {
			//최상위 Exception은 catch 블럭 제일 마지막에 사용한다.
		}
	}

}
