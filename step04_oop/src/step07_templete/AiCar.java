package step07_templete;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("AI가 자율주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Ai가 스스로 정지합니다.");
		
	}

}
