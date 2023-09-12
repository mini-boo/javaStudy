package step07_templete;

public class CarTest {

	public static void main(String[] args) {
		ManualCar mCar = new ManualCar();
		mCar.run();
		
		
//		mCar.turnOn();
//		mCar.drive();
//		mCar.stop();
//		mCar.turnOff();
		
		AiCar aiCar = new AiCar();
		aiCar.run();
		

	}

}
