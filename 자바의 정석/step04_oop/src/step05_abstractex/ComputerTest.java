package step05_abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//computer 클래스가 추상 클래스라면 객체 생성 불가능!!
		//Computer computer = new Computer();
		//computer.display();
		
		//Desktop 객체
		Desktop desktop = new Desktop();
		desktop.turnon();
		
		//? laptop 객체 생성 (computer 추상클래스 상속 활용)
		Laptop laptop = new Laptop();
		

	}

}
