package step02_Listup;

import Exceptional.NotCoupangException;

public class ExceptionPractice {
	
	/*
	 * - list : "coupang" -> 정상 실행
	 * - list : not "coupang" -> 비정상 실행 -> 예외 발생 (NotAdminException)
	 * 
	 */
	
	public static void checkCoupang(String list) throws NotCoupangException {
		if("coupang".equals(list)) {
			System.out.println("리스트업 성공");
		} else {
		throw new NotCoupangException("리스트업 실패");
		}
	}
	
	public static void main(String[] args) {
		String list = "marketcurly";
		
		try {
			checkCoupang(list);
		} catch (NotCoupangException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
}
