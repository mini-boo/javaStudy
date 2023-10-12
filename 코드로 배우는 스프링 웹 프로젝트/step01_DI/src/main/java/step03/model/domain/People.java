package step03.model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class People {
	private String name;
	private int age;
	
	@Autowired(required = false) //지정객체가 존재하지 않더라도 기본 null 값으로 PEOPLE 생성하기.
	private Car car;
	
	
	public People() {
		System.out.println("사람 기본 생성자");
	}


	public People(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
		System.out.println("사람 일반 생성자");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
	
	
}
