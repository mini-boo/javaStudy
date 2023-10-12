package step01.model.domain;

public class Car {
	private int carNo;
	private String CarName;
	
	
	
	public Car() {
		System.out.println("자동차 기본 생성자");
	}



	public Car(int carNo, String carName) {
		this.carNo = carNo;
		this.CarName = carName;
		System.out.println("자동차 일반 생성자");
	}



	public int getCarNo() {
		return carNo;
	}



	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}



	public String getCarName() {
		return CarName;
	}



	public void setCarName(String carName) {
		CarName = carName;
	}



	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", CarName=" + CarName + "]";
	}
	
	
	
	
}
