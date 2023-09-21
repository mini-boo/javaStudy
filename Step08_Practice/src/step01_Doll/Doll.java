package step01_Doll;

public abstract class Doll {

	public void order() {
		System.out.println("주문제작을 통해 공정이 시작된다.");
	}
	
	abstract void factory();
	
	abstract void confirm();
	
	public void release() {
		System.out.println("상품이 출고되었습니다.");
	}
	
	
}
