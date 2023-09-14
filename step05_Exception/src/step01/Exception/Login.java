package step01.Exception;

import exception.NotAdminException;

public class Login {
	
	/*
	 * 관리자 계정 검증
	 * - id : "admin" -> 정상 실행
	 * - id : not "admin" -> 비정상 실행 -> 예외 발생 (NotAdminException)
	 * 
	 */
		
		//관리자 계정검증
	public static void checkAdmin(String id) throws NotAdminException {
		if("admin".equals(id)) {
			System.out.println("관리자 로그인 성공");
		}else {
			//예외 발생 문법
			throw new NotAdminException("관리자 로그인 실패");
			}
		}
		
public static void main(String[] args) {
	String id = "user";
	
	try {
		checkAdmin(id);
	} catch (NotAdminException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}

}

}
