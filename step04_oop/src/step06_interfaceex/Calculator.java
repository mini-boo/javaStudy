package step06_interfaceex;

//인터페이스 가져오는 방법 : implements

public class Calculator implements Calculation, Connection {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public void connect() {
		
		
	}

}
