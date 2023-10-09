package concert.exception;

public class NotExistException extends Exception{
	
	//예약정보, 고객정보, 콘서트 정보 존재하지 않을 경우 예외 발생을 위한 사용자 정의 예외 처리
	public NotExistException() {}
	public NotExistException(String message) {
		super(message);
	}

}
