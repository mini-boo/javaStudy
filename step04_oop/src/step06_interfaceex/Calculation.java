package step06_interfaceex;

public interface Calculation {
	
	//상수
	//public static final double PI = 3.14;
	double PI = 3.14;
	
	//추상 메소드
	//public int add();
	public int add(int x, int y);
	public int sub(int x, int y);
}
