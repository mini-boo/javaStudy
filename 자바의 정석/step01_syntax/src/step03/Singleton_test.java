package step03;

import java.util.Calendar;

public class Singleton_test {

	public static void main(String[] args) {
		singleton singleton1 = singleton.getInstance();
		singleton singleton2 = singleton.getInstance();
		//singleton1, 2은 각각 다른 객체
		
		//calender
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getWeekYear());
}
}
