package biz;

public class Car {
	
	//buy : 파라미터 없이 메소드만
	public void buy() {
		System.out.println("자동차 구매");
	}
	
	//buyMoney : 파라미터 있고 메소드 있음
	public void buyMoney(int money) {
		System.out.println("자동차 구매 금액 : " + money);
	}
	
	//buyReturn : 구매 성공 시 동작하는 메소드 : 파라미터 없고 리턴값 있음
	public String buyReturn() {
		return "구매 성공";
	}
	
	//sellMoney : 판매 금액이 1000이하면 예외 발생: 파라미터 있고 예외 있음
	public void sellMoney(int money) throws Exception {
		if(money <= 1000) {
			throw new Exception("1000원 이하로는 판매 금지 : 예외");
		}
	}
	
}
