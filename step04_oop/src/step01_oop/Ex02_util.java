package step01_oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02_util {
	public static void main(String[] args) {
		// Date 클래스
		Date date = new Date();
//		System.out.println(date);
		
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		System.out.println(sdf.format(date));
	}
}
