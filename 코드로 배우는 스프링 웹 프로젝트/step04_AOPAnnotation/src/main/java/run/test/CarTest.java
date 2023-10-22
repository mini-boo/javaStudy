package run.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		Car car = context.getBean(Car.class);
		car.buy();
		
		car.buyMoney(5000);
		
		car.buyReturn();
		
		try {
			car.sellMoney(900);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
